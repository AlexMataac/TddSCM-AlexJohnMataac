package com.academy.springboot.Printer;

import com.academy.springboot.Model.Employee;
import com.academy.springboot.Reporter.EmployeeReporter;
import com.academy.springboot.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeePrinter implements EmployeeReporter {

    @Autowired
    EmployeeService employeeService;

    @Override
    public void report(Employee employee) {
        List<Employee> employeesThatEarningMoreThan100k = employeeService.getAllEmployeeThatAreEarningMoreThan(100000d);

        System.out.println("Here are the employees that earning more than 100k");
        employeesThatEarningMoreThan100k.forEach(e -> System.out.println(e.toString()));

        List<Employee> employeesExceedingAge30 = employeeService.getAllEmployeesExceedingAge(30);

        System.out.println("Here are the employees exceeding age 30");
        employeesExceedingAge30.forEach(e -> System.out.println(e.toString()));

        List<Employee> employeesWithMatchingCompanyCognizantSoftvision = employeeService.getAllEmployeesWithMatchingCompany("Cognizant Softvision");

        System.out.println("Here are the employees with matching company Cognizant Softvision");
        employeesWithMatchingCompanyCognizantSoftvision.forEach(e -> System.out.println(e.toString()));

        List<Employee> employeesWithHighestSalary140k = employeeService.getAllEmployeeWithHighestSalary();

        System.out.println("Here are the employees with highest salary 140l");
        employeesWithHighestSalary140k.forEach(e -> System.out.println(e.toString()));
    }
}
