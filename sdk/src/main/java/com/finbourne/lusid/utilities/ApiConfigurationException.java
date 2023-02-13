package com.finbourne.lusid.utilities;

/**
 * Exception on failing to build a valid {@link ApiConfiguration}
 *
 */
public class ApiConfigurationException extends Exception{

    public ApiConfigurationException(String message){
        super(message);
    }

    public ApiConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
