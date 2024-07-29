package com.zeus.exception;

public class InvalidRoleException extends RuntimeException {

    private static final String ERROR_MESSAGE = "Invalid role!";

    public InvalidRoleException() {
        super(ERROR_MESSAGE);
    }

    public InvalidRoleException(String message) {
        super(message);
    }

    public InvalidRoleException(String message, Throwable cause) {
        super(message, cause);
    }
}
