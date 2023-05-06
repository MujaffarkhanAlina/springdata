package com.practice.exception;

public class EmployeeNotExist extends RuntimeException {


    public EmployeeNotExist(String message){
        super(message);
    }

    public EmployeeNotExist(String message, Throwable throwable){
        super(message,throwable);
    }



}
