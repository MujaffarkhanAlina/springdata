package com.practice.sevicesimpl;

import com.practice.common.Constant;
import com.practice.dto.EmployeeDto;
import com.practice.entity.Employee;
import com.practice.exception.EmployeeAlreadyExistException;
import com.practice.exception.EmployeeNotExist;
import com.practice.repository.EmployeeRepository;
import com.practice.services.EmployeeServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceInterfaceImpl implements EmployeeServiceInterface {


    Logger log = LoggerFactory.getLogger(EmployeeServiceInterfaceImpl.class);
    @Autowired
    EmployeeRepository employeeRepository;


    public void addEmployee(EmployeeDto employeeDto) {
      log.info("Start method addEmployee");
      Optional<Employee> employee1 =employeeRepository.findByFirstName(employeeDto.getFirstName());

      if(employee1.isEmpty()) {

          Employee employee = new Employee();
          employee.setFirstName(employeeDto.getFirstName());
          employee.setLastName(employeeDto.getLastName());
          employee.setTimeStamp(employeeDto.getTimeStamp());
          employeeRepository.save(employee);
          log.info("End method addEmployee Successfully");
      }else {

          throw  new EmployeeAlreadyExistException("Employee already exist");
      }
    }

    @Override
    public void deleteEmployeebyId(int employeeId) {
        log.info("Start method deleteEmployeebyId");
        Optional<Employee> employee =employeeRepository.findById(employeeId);
        if(employee.isEmpty()){
            log.info("Employee does not exist");
            throw new EmployeeNotExist(Constant.EMPLOYEE_NOT_EXIST, null);
        }

        employeeRepository.deleteById(employeeId);
        log.info("Employee deleted successfully ");
    }


    @Override
    public List<Employee> getEmployeeList() {
         return employeeRepository.findAll();
    }
}
