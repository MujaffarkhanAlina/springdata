package com.practice.conroller;

import com.practice.dto.EmployeeDto;
import com.practice.entity.Employee;
import com.practice.exception.BindingException;
import com.practice.services.EmployeeServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {

    Logger log = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    EmployeeServiceInterface employeeServiceInterface;

    @PostMapping("/addEmployee")
    public ResponseEntity<Object> addEmployee(@Valid @RequestBody EmployeeDto employeeDto, BindingResult result) throws BindingException  {

        if(result.hasErrors()){

            throw new BindingException("Payload is not valid Json");

         }

        employeeServiceInterface.addEmployee(employeeDto);
        return new ResponseEntity(HttpStatus.OK);
}

    @DeleteMapping("/deleteEmployee")
    public ResponseEntity<Object> deleteEmployee(@RequestParam("employeeId") int employeeId){
    employeeServiceInterface.deleteEmployeebyId(employeeId);
    return new ResponseEntity(HttpStatus.OK);
    }

     @PostMapping("/getEmployeeList")
     public List<Employee> getEmployeeList(){
        return employeeServiceInterface.getEmployeeList();
     }



}
