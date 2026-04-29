package com.turkcell.library_starter.exception;

public class BusinessException extends RuntimeException {

    private final String title;
    private final String type;

    public BusinessException(String title, String type, String message) {
        super(message);
        this.title = title;
        this.type = type;
    }

    public BusinessException(String title, String type, String message, Throwable cause) {
        super(message, cause);
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }
}
