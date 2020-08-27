package com.finbourne.features;

import org.apache.commons.codec.Charsets;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class FeatureExtractorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkIfWriterWritesCorrectly() throws ClassNotFoundException, IOException, URISyntaxException, DuplicateFeatureException, NullFeatureValueException {
        FeatureExtractor featureExtractor = new FeatureExtractor();
        FeatureFileWriter featureFileWriter = new FeatureFileWriter();

        List<String> annotations = featureExtractor.getAnnotations("com.finbourne.lusid.tutorials");
        String annotationsFromMethod = String.join("\n", annotations);
        String fileName = "features.txt";
        featureFileWriter.writeToFile(annotationsFromMethod, fileName);
        List<String> lines = Files.readAllLines(Paths.get(fileName), Charsets.UTF_8);
        String annotationsFromFile = String.join("\n", lines);

        assertThat(annotationsFromMethod, equalTo(annotationsFromFile));
    }

    @Test
    public void getValidAnnotations() throws ClassNotFoundException, IOException, URISyntaxException, DuplicateFeatureException, NullFeatureValueException {
        FeatureExtractor featureExtractor = new FeatureExtractor();

        List<String> annotations = featureExtractor.getAnnotations("com.finbourne.features.dummyfiles.valid");

        assertThat(annotations.size(), equalTo(2));
        assertThat(annotations, hasItems("F1", "F2"));
    }

    @Test
    public void throwErrorOnDuplicateAnnotations() throws ClassNotFoundException, IOException, NullFeatureValueException, DuplicateFeatureException, URISyntaxException {
        FeatureExtractor featureExtractor = new FeatureExtractor();

        thrown.expect(DuplicateFeatureException.class);
        List<String> annotations = featureExtractor.getAnnotations("com.finbourne.features.dummyfiles.duplicates");

    }

    @Test
    public void throwErrorOnEmptyStringAnnotations() throws ClassNotFoundException, IOException, NullFeatureValueException, DuplicateFeatureException, URISyntaxException {
        FeatureExtractor featureExtractor = new FeatureExtractor();

        thrown.expect(NullFeatureValueException.class);
        List<String> annotations = featureExtractor.getAnnotations("com.finbourne.features.dummyfiles.empties");

    }

    @Test
    public void throwErrorOnNoInputAnnotations() throws ClassNotFoundException, IOException, NullFeatureValueException, DuplicateFeatureException, URISyntaxException {
        FeatureExtractor featureExtractor = new FeatureExtractor();

        thrown.expect(NullFeatureValueException.class);
        List<String> annotations = featureExtractor.getAnnotations("com.finbourne.features.dummyfiles.noinput");
    }

    @Test
    public void returnEmptyListWhenMethodsNotAnnotated() throws ClassNotFoundException, IOException, NullFeatureValueException, DuplicateFeatureException, URISyntaxException {
        FeatureExtractor featureExtractor = new FeatureExtractor();

        List<String> annotations = featureExtractor.getAnnotations("com.finbourne.features.dummyfiles.notannotated");

        assertThat(annotations.size(), equalTo(0));
    }
}
