package com.payrollmanagement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PayrollListMain {
    public static void main(String[] args) throws NoSuchMethodException {
        PayrollList<List<Employee>> pl = new PayrollList<>(new ArrayList<>());
        pl.addPayroll(new Payroll(new FullTimeEmployee(1,"Akash","IT",50000,10000)));
        pl.addPayroll(new Payroll(new FullTimeEmployee(2,"Vikram","Testing",80000,5000)));
        pl.printTaxDeductionAndOvertimeAddition(150);

        PayrollList<HashSet<Employee>> pl2 = new PayrollList<>(new HashSet<>());
        pl2.addPayroll(new Payroll(new FullTimeEmployee(1,"Akash","IT",50000,10000)));
        pl2.addPayroll(new Payroll(new FullTimeEmployee(2,"Vikram","Testing",80000,5000)));
        pl2.printTaxDeductionAndOvertimeAddition(150);
    }
}
