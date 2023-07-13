package com.finbourne.lusid.utilities;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static com.finbourne.lusid.utilities.TestContants.DUMMY_CREDENTIALS_FILE;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FileConfigurationLoaderTests {

    private FileConfigurationLoader fileConfigurationLoader;

    @Before
    public void setUp(){
        fileConfigurationLoader = new FileConfigurationLoader();
    }

    @Test
    public void loadConfiguration_FromResources_ShouldLoadConfigFile() throws IOException {
        File credentialsFile = fileConfigurationLoader.loadConfiguration(DUMMY_CREDENTIALS_FILE);
        assertTrue(credentialsFile.exists());
        assertThat(credentialsFile.getName(), equalTo(DUMMY_CREDENTIALS_FILE));
    }

    @Test
    public void loadConfiguration_FromAbsolutePath_ShouldLoadConfigFile() throws IOException {
        String dummyCredAbsPath = getAbsolutePathOfDummyCredentialsFile();
        File credentialsFile = fileConfigurationLoader.loadConfiguration(dummyCredAbsPath);
        assertTrue(credentialsFile.exists());
        assertThat(credentialsFile.getName(), equalTo(DUMMY_CREDENTIALS_FILE));
    }

    @Test(expected = IOException.class)
    public void loadConfiguration_FromNonExistingFile_ShouldThrowException() throws IOException {
        fileConfigurationLoader.loadConfiguration("does_not_exist.json");
    }

    private String getAbsolutePathOfDummyCredentialsFile(){
        return new File(getClass().getClassLoader().getResource(DUMMY_CREDENTIALS_FILE).getFile()).getAbsolutePath();
    }


}
