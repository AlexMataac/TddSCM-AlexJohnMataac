package com.academy.springboot.Model;

import java.util.Objects;



public class Employee {


    private String name;
    private int age;
    private double salary;
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }




    public Employee(String name, int age, double salary, String company) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.company = company;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getAge() == employee.getAge() && Double.compare(employee.getSalary(), getSalary()) == 0 && getName().equals(employee.getName()) && getCompany().equals(employee.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getSalary(), getCompany());
    }
}


