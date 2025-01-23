package com.payrollmanagement;

public class PayrollMain {
    public static void main(String[] args) throws NoSuchMethodException {
        Payroll p = new Payroll(new FullTimeEmployee(1,"Akash","IT",50000,10000));
        System.out.println(p.taxDeduction());
        System.out.println(p.overtimeCostAddition(150));
    }
}
