package com.academy.springboot.Reporter;

import com.academy.springboot.Controller.EmployeeController;
import com.academy.springboot.Model.Employee;
import com.academy.springboot.Service.EmployeeService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {

    @Mock
            private EmployeeService employeeService;

    @InjectMocks
            private EmployeeController employeeController;

    @Test
    @DisplayName("Given a request, " +
    "When EmployeeController Should" +
    "Then execute service")
    void testThatAreEarningMoreThan() {

        //Arrange
        Employee wayne = new Employee("Wayne", 30,110000d,"Cognizant Softvision");
        Employee jerome = new Employee("Jerome", 26, 140000d,"Cognizant Softvision");
        Employee shaun = new Employee("Shaun", 25, 130000,"Cognizant Softvision");
        Employee ali = new Employee("Ali", 25,  120000,"Cognizant Softvision");
when(employeeService.getAllEmployeeThatAreEarningMoreThan(100000d)).thenReturn(List.of(wayne,jerome));
        //Act
        List<Employee> employeeList = employeeController.getAllEmployeeThatAreEarningMoreThan(100000d);

        //Assert
        assertThat(employeeList).contains(wayne, jerome);
    }
}
