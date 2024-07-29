package com.zeus.exception;

public class DuplicateUsernameException extends RuntimeException {

    private static final String ERROR_MESSAGE = "Username is already taken";

    public DuplicateUsernameException() {
        super(ERROR_MESSAGE);
    }

    public DuplicateUsernameException(String message) {
        super(message);
    }

    public DuplicateUsernameException(String message, Throwable cause) {
        super(message, cause);
    }
}

