package com.payrollmanagement;

public class FullTimeEmployee extends Employee{
    int annualBonus;
    public FullTimeEmployee(int employeeId, String name, String department, int baseSalary, int annualBonus) {
        super(employeeId, name, department, baseSalary);
        this.annualBonus = annualBonus;
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
