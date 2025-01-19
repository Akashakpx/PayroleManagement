package com.payrollmanagement;

public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private int optimalHour = 80;
    public PartTimeEmployee(int employeeId, String name, String department, int baseSalary, int hoursWorked) {
        super(employeeId, name, department, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    public String defineWorkHours(){
        return "Employee should work "+optimalHour+" hours in a month";
    }

    public String assignProject(){
        return "Part time employees are assigned for short-term project";
    }

    @Override
    public int salaryCalculation(){
        return (int)(((double)getHoursWorked()/optimalHour)*getBaseSalary());
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
