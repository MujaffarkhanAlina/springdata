package com.practice.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class EmployeeResposeException {

    private String message;
    private Throwable throwable;
    private HttpStatus httpStatus;

    public EmployeeResposeException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }


}
