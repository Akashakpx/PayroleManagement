package com.payrollmanagement;

public class Contractor extends EmployeeType implements Payable {
    @Override
    public void calculateWorkHours(){
        System.out.println("Contractor should work "+getWorkHours()+" hours in a month");
    }
    @Override
    public void calculatePay(){
        System.out.println("Calculated Pay for the Contractor will be around 20 lakhs and more");
    }
}
