package org.tuni.belovMExceptionsHW;

public class StopWorkException extends RuntimeException {
    public StopWorkException(String message) {
        super(message);
    }
}