package com.zeus.exception;

public class PersonalTrainerAlreadyRatedException extends RuntimeException {

    private static final String ERROR_MESSAGE = "Personal trainer has been already rated by this client!";

    public PersonalTrainerAlreadyRatedException() {
        super(ERROR_MESSAGE);
    }

    public PersonalTrainerAlreadyRatedException(String message) {
        super(message);
    }

    public PersonalTrainerAlreadyRatedException(String message, Throwable cause) {
        super(message, cause);
    }
}