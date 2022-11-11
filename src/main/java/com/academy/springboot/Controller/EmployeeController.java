package com.academy.springboot.Controller;

import com.academy.springboot.Model.Employee;
import com.academy.springboot.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public List<Employee> getAllEmployeeThatAreEarningMoreThan(Double amount) {
        return employeeService.getAllEmployeeThatAreEarningMoreThan(amount);
    }

}
