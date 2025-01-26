package com.payrollmanagement;

public class RegularSalaryCalculator implements SalaryCalculator{
    @Override
    public double calculate(double basePay) {
        if(basePay<=0){
            throw new IllegalArgumentException("basePay can't be negative or zero");
        }
        return basePay;
    }
}
