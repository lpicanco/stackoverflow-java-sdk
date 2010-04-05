/**
 *
 */
package com.google.code.stackoverflow.client.examples;

import java.text.MessageFormat;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.google.code.stackoverflow.client.StackOverflowApiClient;
import com.google.code.stackoverflow.client.StackOverflowApiClientFactory;
import com.google.code.stackoverflow.schema.Statistics;

/**
 * @author Nabeel Mukhtar
 *
 */
public class StatsApiExample {

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
    		
    		final StackOverflowApiClientFactory factory = StackOverflowApiClientFactory.newInstance(keyValue);
    		final StackOverflowApiClient client = factory.createStackOverflowApiClient();
    		
    		Statistics stats = client.getStatistics();
    		printResult(stats);
    		
        } else {
            printHelp(options);
        }
    }

	private static void printResult(Statistics stats) {
		System.out.println("Answers per minute:" + stats.getAnswersPerMinute());
		System.out.println("Badges per minute:" + stats.getBadgesPerMinute());
		System.out.println("Questions per minute:" + stats.getQuestionsPerMinute());
		System.out.println("Total answers:" + stats.getTotalAnswers());
		System.out.println("Total badges:" + stats.getTotalBadges());
		System.out.println("Total comments:" + stats.getTotalComments());
		System.out.println("Total questions:" + stats.getTotalQuestions());
		System.out.println("Total unanswered questions:" + stats.getTotalUnanswered());
		System.out.println("Total users:" + stats.getTotalUsers());
		System.out.println("Total votes:" + stats.getTotalVotes());
		System.out.println("API Version:" + stats.getApiVersion().getVersion() + ":" + stats.getApiVersion().getRevision());
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
        String syntax = StatsApiExample.class.getName() + " <options>";
        String header = MessageFormat.format("\nThe -{0} option is required.", APPLICATION_KEY_OPTION);
        String footer = "";
        new HelpFormatter().printHelp(width, syntax, header, options, footer, false);
    }
}
