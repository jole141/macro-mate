package com.zeus.exception;

public class DuplicateEmailException extends RuntimeException {

    private static final String ERROR_MESSAGE = "Email is already in use!";

    public DuplicateEmailException() {
        super(ERROR_MESSAGE);
    }

    public DuplicateEmailException(String message) {
        super(message);
    }

    public DuplicateEmailException(String message, Throwable cause) {
        super(message, cause);
    }
}

