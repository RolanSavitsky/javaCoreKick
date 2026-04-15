package com.hopik.task1.exception;

public class ArrayException extends Exception {

    public ArrayException(String message){
        super(message);
    }

    public ArrayException(String message, Throwable reason){
        super(message, reason);
    }
}
