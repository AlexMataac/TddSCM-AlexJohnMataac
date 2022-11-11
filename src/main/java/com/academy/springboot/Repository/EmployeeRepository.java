package com.academy.springboot.Repository;

import com.academy.springboot.Model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeRepository {

    List<Employee> getAllEmployees();
}
