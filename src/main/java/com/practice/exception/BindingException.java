package com.practice.exception;

public class BindingException extends Exception {


    public BindingException(String message){

        super(message);

    }

    public BindingException(String message, Throwable  throwable){

        super(message, throwable);

    }

}
