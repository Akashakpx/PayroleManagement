package com.payrollmanagement;

public class Main {
    public static void main(String[] args) {
        PayrollSystem p = new PayrollSystem();
        p.addEmployee(new FullTimeEmployee(1,"Akash","IT",50000,10000));
        p.addEmployee(new FullTimeEmployee(2,"Vikram","IT",80000,5000));
        p.removeEmployee(1);
        p.printAllEmployee();
    }
}
