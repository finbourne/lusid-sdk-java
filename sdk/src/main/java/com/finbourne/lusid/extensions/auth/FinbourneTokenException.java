package com.finbourne.lusid.extensions.auth;

/**
* Exception for errors and issues related to retrieving {@link FinbourneToken}
*
*/
public class FinbourneTokenException extends Exception{

    public FinbourneTokenException(String message){super(message); }

    public FinbourneTokenException(String message, Throwable cause) {super(message, cause); }
}
