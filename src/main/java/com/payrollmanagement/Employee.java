package com.payrollmanagement;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private int baseSalary;

    public Employee(int employeeId, String name, String department, int baseSalary) {
        setEmployeeId(employeeId);
        setName(name);
        setDepartment(department);
        setBaseSalary(baseSalary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setEmployeeId(int employeeId) {
        if(employeeId <= 0){
            throw new IllegalArgumentException("Employee Id should be positive");
        }
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0){
            throw new IllegalArgumentException("BaseSalary Should be greater than 0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
