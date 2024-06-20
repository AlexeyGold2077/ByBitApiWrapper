package com.alexeygold2077.api;

public class ByBitException extends Exception {

    private final String errorCode;
    private final String errorMessage;

    public ByBitException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}