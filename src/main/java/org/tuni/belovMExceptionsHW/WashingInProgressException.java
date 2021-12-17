package org.tuni.belovMExceptionsHW;

public class WashingInProgressException extends RuntimeException {
    public WashingInProgressException(String message) {
        super(message);
    }
}