package com.zeus.exception;

public class EntityNotFoundException extends RuntimeException {

    private static final String ERROR_MESSAGE = "Entity not found in database";

    public EntityNotFoundException() {
        super(ERROR_MESSAGE);
    }

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
