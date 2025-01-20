package com.payrollmanagement;

public class PermanentEmployee extends EmployeeType implements Payable {
    public void calculateWorkHours(){
        System.out.println("Permanent employee should work "+getWorkHours()+" hours in a month");
    }
    public void calculatePay(){
        System.out.println("Calculated Pay for the permanent Employee will be around 10 lakhs and more");
    }
}
