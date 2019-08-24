package com.company;

public class Employee {
    protected int employeeID;
    protected String name;

    public Employee(int employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
