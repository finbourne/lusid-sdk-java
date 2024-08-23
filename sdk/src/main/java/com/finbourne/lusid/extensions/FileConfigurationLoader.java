package com.finbourne.lusid.extensions;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class FileConfigurationLoader {

    /**
    * Loads the API configuration either from the resources in the classpath or directly from
    * the file system.
    *
    * @param apiConfigurationFile name of the resource or absolute path of the configuration file
    * @return API configuration file
    * @throws IOException if config cannot be found
    */
    public File loadConfiguration(String apiConfigurationFile) throws IOException {

        Optional<File> configFileFromResource = getConfigFileFromResources(apiConfigurationFile);
        if (configFileFromResource.isPresent()) {
            return configFileFromResource.get();
        }

        Optional<File> configFileFromPath = getConfigFileFromPath(apiConfigurationFile);
        if (configFileFromPath.isPresent()) {
            return configFileFromPath.get();
        }

        throw new IOException("Cannot find '" + apiConfigurationFile + "' in either classpath resources or as an absolute path.");
    }

    private Optional<File> getConfigFileFromResources(String apiConfig){
        ClassLoader classLoader = getClassLoader();
        URL configUrl = classLoader.getResource(apiConfig);
        return (configUrl != null) ? Optional.of(new File(configUrl.getFile())) : Optional.empty();
    }

    private Optional<File> getConfigFileFromPath(String apiConfig){
        File configFile = getFile(apiConfig);
        return (configFile.exists()) ? Optional.of(configFile) : Optional.empty();
    }

    // factory methods for test mocking purposes.
    public ClassLoader getClassLoader(){
        return getClass().getClassLoader();
    }

    public File getFile(String path){
        return new File(path);
    }

}
