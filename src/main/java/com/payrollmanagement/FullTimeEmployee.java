package com.payrollmanagement;

public class FullTimeEmployee extends Employee{
    int annualBonus;
    public FullTimeEmployee(int employeeId, String name, String department, int baseSalary, int annualBonus) {
        super(employeeId, name, department, baseSalary);
        this.annualBonus = annualBonus;
    }

    public String defineWorkHours(){
        return "Employee should work 176 hours in a month";
    }

    public String assignProject(){
        return "Full time employees are assigned project given by big client";
    }

    @Override
    public int salaryCalculation(){
        return getBaseSalary()+getAnnualBonus()/12;
    }

    public int getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(int annualBonus) {
        if(annualBonus<0){
            throw new IllegalArgumentException("Annual Bonus can't be less than 0");
        }
        this.annualBonus = annualBonus;
    }
}
