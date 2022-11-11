package com.academy.springboot.Service;

import com.academy.springboot.Model.Employee;
import com.academy.springboot.Repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;
    Employee wayne = new Employee("Wayne", 30,110000d,"Cognizant Softvision");
    Employee jerome = new Employee("Jerome", 26, 140000d,"Cognizant Softvision");
    Employee shaun = new Employee("Shaun", 25, 130000,"Cognizant Softvision");
    Employee ali = new Employee("Ali", 25,  120000,"Cognizant Softvision");


    @BeforeEach
    public void setup(){
        List<Employee> employees = List.of(wayne,
                jerome,shaun,ali);
        Mockito.when(employeeRepository.getAllEmployees())
                .thenReturn(employees);
    }

    @Test
    @DisplayName("Given employees from EmployeeRepositoryFromCSV" +
            "When getAllEmployeeThatAreEarningMoreThan is executed with input 80000" +
            "Then result should return Wayne and Jerome")
    void testEmployeesEarningMoreThanAccount() {
        // Act
        List<Employee> employeesFromCSV = employeeService.getAllEmployeeThatAreEarningMoreThan(90000d);
        // Assert
        assertThat(employeesFromCSV).contains(wayne, jerome);
    }

    @Test
    @DisplayName("Given employees from EmployeeRepositoryFromCSV" +
            "When getAllEmployeesExceedingAge is executed with input 29" +
            "Then result should return Wayne")
    void testEmployeesExceedingAge() {
        // Act
        List<Employee> employeesFromCSV = employeeService.getAllEmployeesExceedingAge(29);
        // Assert
        assertThat(employeesFromCSV).contains(wayne);
    }

    @Test
    @DisplayName("Given employees from EmployeeRepositoryFromCSV" +
    "When getallEmployeesMatchingPosition is executed with input Junior Software Engineer" +
    "Then result should return Shaun and Ali")
    void testEmployeesMatchingCompany() {
        // Act
        List<Employee> employeesFromCSV = employeeService.getAllEmployeesWithMatchingCompany("Cognizant Softvision");
        // Assert
        assertThat(employeesFromCSV).contains(wayne,jerome, shaun, ali);
    }

    @Test
    @DisplayName("Given employees from EmployeesRepositoryFromCSV" +
            "When getAllEmployeeWithHighestSalary is executed with input" +
            "Then result should return Don")
    void testEmployeeWithHighestSalary() {
        // Act
        List<Employee> employeesFromCSV = employeeService.getAllEmployeeWithHighestSalary();
        // Assert
        assertThat(employeesFromCSV).contains(jerome);
    }
}

