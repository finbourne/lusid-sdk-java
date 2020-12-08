package com.finbourne.features;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import com.finbourne.features.reporter.*;
import org.apache.commons.cli.*;


public class Main {
    public static void main(String args[]) throws ClassNotFoundException, IOException, NullFeatureValueException, DuplicateFeatureException, URISyntaxException, ParseException {
        // Initialise options class for arg parser
        Options options = new Options();

        // Configure package parameter
        Option pkg = new Option("p", "package", true, "package name, eg. 'com.finbourne.lusid.tutorials'");
        pkg.setRequired(true);
        options.addOption(pkg);

        // Configure fully qualified filepath parameter
        Option fName = new Option("f", "filepath", true, "Fully qualified filepath name for the features file to be created. Eg. c/users/<some-dir>/<another-dir>/filename.txt");
        fName.setRequired(true);
        options.addOption(fName);

        // Initialise command line parser
        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd = null;


        try {
            // Attempt retrieving
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            // If parameters are not passed correctly, that will throw a MissingOptionException
            // and display the missing parameters in a pretty format
            formatter.printHelp("utility-name", options);
            throw e;
        }

        // Retrieve the parameters passed in the cmd line
        String packageName = cmd.getOptionValue("package");
        String filepath = cmd.getOptionValue("filepath");

        System.out.println(packageName);

        // Initialise feature extractor and writer
        FeatureExtractor featureExtractor = new FeatureExtractor();
        FeatureFileWriter featureFileWriter = new FeatureFileWriter();

        // Retrieve features from source code annotations
        List<String> annotations = featureExtractor.getAnnotations(packageName);
        String annotationsFromMethod = String.join("\n", annotations);

        // Write features to file
        featureFileWriter.writeToFile(annotationsFromMethod, filepath);
        System.out.println("Done writing to filepath: " + filepath);
    }
}
