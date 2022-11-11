package com.academy.springboot.Service;

import com.academy.springboot.Model.Employee;
import com.academy.springboot.Repository.EmployeeRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeThatAreEarningMoreThan(Double amount) {
        return employeeRepository.getAllEmployees()
                .stream().filter(employee -> employee.getSalary() > amount)
                .collect(Collectors.toList());
    }
    public List<Employee> getAllEmployeesExceedingAge(int age){
        return employeeRepository.getAllEmployees()
                .stream().filter(employee -> employee.getAge() > age)
                .collect(Collectors.toList());
    }
    public List<Employee> getAllEmployeesWithMatchingCompany(String company) {
        return employeeRepository.getAllEmployees()
                .stream().filter(employee -> employee.getCompany().equals(company))
                .collect(Collectors.toList());
    }
    public List<Employee> getAllEmployeeWithHighestSalary() {
        double salary = employeeRepository.getAllEmployees()
                .stream().max(Comparator.comparing(Employee::getSalary))
                .get().getSalary();
        Stream<Employee> employee = employeeRepository.getAllEmployees()
                .stream().filter(emp -> emp.getSalary() == salary);
        return employee.toList();
    }
}
