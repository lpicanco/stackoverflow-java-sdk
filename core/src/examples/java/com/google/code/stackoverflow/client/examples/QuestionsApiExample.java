/**
 * 
 */
package com.google.code.stackoverflow.client.examples;

import java.text.MessageFormat;
import java.util.EnumSet;
import java.util.List;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.google.code.stackoverflow.client.StackOverflowApiClient;
import com.google.code.stackoverflow.client.StackOverflowApiClientFactory;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.Question;
import com.google.code.stackoverflow.schema.PostTimeline;

/**
 * @author Nabeel Mukhtar
 *
 */
public class QuestionsApiExample {

    /**
     * Consumer Key
     */
    private static final String APPLICATION_KEY_OPTION = "key";
	
    /**
     * ID
     */
    private static final String ID_OPTION = "id";
    
    /**
     * Name of the help command line option.
     */
    private static final String HELP_OPTION = "help";
    
    /**
	 * @param args
	 */
	public static void main(String[] args) {
		Options options = buildOptions();
        try {
            CommandLine line = new BasicParser().parse(options, args);
            processCommandLine(line, options);
        } catch(ParseException exp ) {
            System.err.println(exp.getMessage());
            printHelp(options);
        }
	}
	
    /**
     * Process command line options and call the service. 
     */
    private static void processCommandLine(CommandLine line, Options options) {
        if(line.hasOption(HELP_OPTION)) {
            printHelp(options);            
        } else if(line.hasOption(APPLICATION_KEY_OPTION)) {
    		final String keyValue = line.getOptionValue(APPLICATION_KEY_OPTION);
    		
    		final StackOverflowApiClientFactory factory = StackOverflowApiClientFactory.newInstance(keyValue);
    		final StackOverflowApiClient client = factory.createStackOverflowApiClient();
    		
    		if(line.hasOption(ID_OPTION)) {
    			String idValue = line.getOptionValue(ID_OPTION);
    			Question question = client.getQuestion(Long.valueOf(idValue));
    			printResult(question);
    		} else {
    			List<Question> questions = client.getQuestions(EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS));
    			for (Question question : questions) {
    				printResult(question);
    			}
    			
    			List<PostTimeline> questionTimeline = client.getQuestionTimeline(2420689L);
    			for (PostTimeline timeline : questionTimeline) {
					printResult(timeline);
				}
    		}
        } else {
            printHelp(options);
        }
    }
	
	private static void printResult(PostTimeline timeline) {
		System.out.println(timeline.getDetail() + ":" + timeline.getTimelineType());
	}

	private static void printResult(Question question) {
		System.out.println(question.getTitle() + ":" + question.getAnswerCount());
	}

	/**
     * Build command line options object.
     */
    private static Options buildOptions() {
       
        Options opts = new Options();
        
        String helpMsg = "Print this message.";
        Option help = new Option(HELP_OPTION, helpMsg);
        opts.addOption(help);

        String consumerKeyMsg = "You API Key.";
        OptionBuilder.withArgName("key");
        OptionBuilder.hasArg();
        OptionBuilder.withDescription(consumerKeyMsg);
        Option consumerKey = OptionBuilder.create(APPLICATION_KEY_OPTION);
        opts.addOption(consumerKey);
        
        String idMsg = "ID of the users to whom a message is to be sent (separated by comma).";
        OptionBuilder.withArgName("id");
        OptionBuilder.hasArg();
        OptionBuilder.withDescription(idMsg);
        Option id = OptionBuilder.create(ID_OPTION);
        opts.addOption(id);
        
        return opts;
    }
    
    /**
     * Print help and usage.
     */
    private static void printHelp(Options options) {
        int width = 80;
        String syntax = QuestionsApiExample.class.getName() + " <options>";
        String header = MessageFormat.format("\nThe -{0} option is required. The -{1} option is optional.", APPLICATION_KEY_OPTION, ID_OPTION);
        String footer = MessageFormat.format("\nIf you do not specify -{0} option, the message is sent to the current user. You can specify multiple ids separated by comma.", ID_OPTION);
        new HelpFormatter().printHelp(width, syntax, header, options, footer, false);
    }
}
