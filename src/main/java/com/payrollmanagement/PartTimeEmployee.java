package com.payrollmanagement;

public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    public PartTimeEmployee(int employeeId, String name, String department, int baseSalary, int hoursWorked) {
        super(employeeId, name, department, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if(hoursWorked<0){
            throw new IllegalArgumentException("hoursWorked can't be less than 0");
        }
        this.hoursWorked = hoursWorked;
    }
}
