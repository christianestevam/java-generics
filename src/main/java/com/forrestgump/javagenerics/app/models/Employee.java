package com.forrestgump.javagenerics.app.models;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private String position;
    private Double salary;
    private String department;
    private String email;

    public Employee(String name, String position, Double salary, String department, String email) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', position='" + position + "', salary=" + salary +
                ", department='" + department + "', email='" + email + "'}";
    }
}
