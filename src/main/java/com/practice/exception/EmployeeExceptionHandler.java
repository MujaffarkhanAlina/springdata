package com.practice.exception;

import com.fasterxml.jackson.databind.JsonMappingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {

    Logger log = LoggerFactory.getLogger(EmployeeExceptionHandler.class);

    @ExceptionHandler(value ={EmployeeAlreadyExistException.class})
    public ResponseEntity<Object> employeeNotExist(EmployeeAlreadyExistException employeeAlreadyExistException){

           log.info("employeeNotExist..............");
          EmployeeResposeException employeeResposeException = new EmployeeResposeException(
                    employeeAlreadyExistException.getMessage(),
                    employeeAlreadyExistException.getCause(),
                    HttpStatus.NOT_FOUND

            );

            return  new ResponseEntity(employeeResposeException, HttpStatus.NOT_FOUND);

     }

  /*   @ExceptionHandler(JsonMappingException.class)
     public ResponseEntity<Object> invalidArgument(JsonMappingException jsonMapping){
         EmployeeResposeException employeeResposeException = new EmployeeResposeException(
                 "Invalid Argument",
                 null,
                 HttpStatus.BAD_REQUEST

         );

         return  new ResponseEntity(employeeResposeException, HttpStatus.BAD_REQUEST);
} */


    @ExceptionHandler(value ={EmployeeNotExist.class})
    public ResponseEntity<Object> employeeNotExist(EmployeeNotExist employeeNotExist){

        log.info("employeeNotExist..............");
        EmployeeResposeException employeeResposeException = new EmployeeResposeException(
                employeeNotExist.getMessage(),
                employeeNotExist.getCause(),
                HttpStatus.NOT_FOUND

        );

        return  new ResponseEntity(employeeResposeException, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(value ={BindingException.class})
    public ResponseEntity<Object> employeeNotExist(BindingException employeeNotExist){

        log.info("BindingException..............");
        EmployeeResposeException employeeResposeException = new EmployeeResposeException(
                employeeNotExist.getMessage(),
                employeeNotExist.getCause(),
                HttpStatus.BAD_REQUEST
         );

        return  new ResponseEntity(employeeResposeException, HttpStatus.BAD_REQUEST);

    }

}
