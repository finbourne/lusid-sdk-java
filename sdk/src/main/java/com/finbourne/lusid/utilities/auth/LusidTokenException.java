package com.finbourne.lusid.utilities.auth;

/**
 * Exception for errors and issues related to retrieving {@link LusidToken}
 *
 */
public class LusidTokenException extends Exception{

    public LusidTokenException(String message){
        super(message);
    }

    public LusidTokenException(String message, Throwable cause) {
        super(message, cause);
    }
}
