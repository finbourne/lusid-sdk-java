package com.finbourne.lusid.integration;

import java.io.File;
import java.io.IOException;

public class TestConfigurationLoader {

    /**
     * Loads the API configuration from a resource in the classpath
     *
     * @param apiConfig name of the resource
     * @return API configuration file
     * @throws IOException
     */
    public File loadConfiguration(String apiConfig) throws IOException {

        ClassLoader classLoader = getClass().getClassLoader();
        File configFile = new File(classLoader.getResource(apiConfig).getFile());

        if (configFile == null) {
            throw new IOException("cannot find " + apiConfig + "in classpath");
        }

        return new File(configFile.toURI());
    }

}
