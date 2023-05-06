package com.practice.services;

import com.practice.dto.EmployeeDto;
import com.practice.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeServiceInterface {


    public void addEmployee(EmployeeDto employee);
    public void deleteEmployeebyId(int employeeI);
    public List<Employee> getEmployeeList();


}
