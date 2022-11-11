package com.academy.springboot.Repository;

import com.academy.springboot.Model.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeRepositoryFromCSVTest {

    @Test
    @DisplayName(" " +
            "When employeeRepositoryFromCSV is executed" +
            "Then it should return valid Employee objects")
    void positiveCase() {

        // Arrange
        EmployeeRepository employeeRepository = new EmployeeRespositoryFromCSV();
        // Act
        List<Employee> employeesFromCSV = employeeRepository.getAllEmployees();
        // Assert
        List<Employee> expectedEmployees = List.of(
                new Employee("Wayne", 30,110000d,"Cognizant Softvision"),
                new Employee("Jerome", 26,140000d,"Cognizant Softvision"),
                new Employee("Shaun", 25, 130000,"Cognizant Softvision"),
                new Employee("Ali",25,120000,"Cognizant Softvision")
        );
        assertEquals(expectedEmployees, employeesFromCSV);
    }
}
