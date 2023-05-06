package com.practice.repository;

import com.practice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

  Optional<Employee> findByFirstName(String firstName);

}
