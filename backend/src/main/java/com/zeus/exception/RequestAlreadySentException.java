package com.zeus.exception;

public class RequestAlreadySentException extends RuntimeException {

    private static final String ERROR_MESSAGE = "Request already sent";

    public RequestAlreadySentException() {
        super(ERROR_MESSAGE);
    }

    public RequestAlreadySentException(String message) {
        super(message);
    }

    public RequestAlreadySentException(String message, Throwable cause) {
        super(message, cause);
    }
}
