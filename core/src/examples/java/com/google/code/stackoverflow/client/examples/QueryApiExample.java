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

import com.google.code.stackoverflow.client.query.QuestionApiQuery;
import com.google.code.stackoverflow.client.query.StackOverflowApiQueryFactory;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.Question;

/**
 * @author Nabeel Mukhtar
 *
 */
public class QueryApiExample {

    /**
     * Consumer Key
     */
    private static final String APPLICATION_KEY_OPTION = "key";
	
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
    		
    		final StackOverflowApiQueryFactory factory = StackOverflowApiQueryFactory.newInstance(keyValue);
    		final QuestionApiQuery query = factory.newQuestionApiQuery();
    		
			List<Question> questions = query.withFetchOptions(EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS)).withSort(Question.SortOrder.HOT).list();
			for (Question question : questions) {
				printResult(question);
			}
        } else {
            printHelp(options);
        }
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
        
        return opts;
    }
    
    /**
     * Print help and usage.
     */
    private static void printHelp(Options options) {
        int width = 80;
        String syntax = QueryApiExample.class.getName() + " <options>";
        String header = MessageFormat.format("\nThe -{0} option is required.", APPLICATION_KEY_OPTION);
        String footer = "";
        new HelpFormatter().printHelp(width, syntax, header, options, footer, false);
    }
}
