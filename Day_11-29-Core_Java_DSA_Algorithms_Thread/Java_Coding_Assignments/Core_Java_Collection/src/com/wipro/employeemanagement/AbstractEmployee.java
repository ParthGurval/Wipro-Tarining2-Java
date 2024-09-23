package com.wipro.employeemanagement;

public abstract class AbstractEmployee implements Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public abstract void work();
}
