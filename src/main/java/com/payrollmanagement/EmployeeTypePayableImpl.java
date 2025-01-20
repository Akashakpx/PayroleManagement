package com.payrollmanagement;

public class EmployeeTypePayableImpl {
    public static void main(String[] args) {
        PermanentEmployee pe = new PermanentEmployee();
        pe.setWorkHours(126);
        pe.calculateWorkHours();
        pe.calculatePay();

        Contractor c = new Contractor();
        c.setWorkHours(150);
        c.calculateWorkHours();
        c.calculatePay();
    }
}
