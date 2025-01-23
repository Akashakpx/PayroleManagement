package com.payrollmanagement;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Payroll {
    private Employee emp;
    public Payroll(Employee e){
        emp = e;
    }

    @PayrollAdjustment
    public int taxDeduction() throws NoSuchMethodException {
        Method taxMethod = this.getClass().getMethod("taxDeduction");
        PayrollAdjustment adjustment = taxMethod.getAnnotation(PayrollAdjustment.class);
        return emp.getBaseSalary()-(int)(adjustment.taxRate()*emp.getBaseSalary());
    }

    @PayrollAdjustment
    public int overtimeCostAddition(int hours) throws NoSuchMethodException {
       Method overtimeMethod = this.getClass().getMethod("overtimeCostAddition", int.class);
       PayrollAdjustment adjustment = overtimeMethod.getAnnotation(PayrollAdjustment.class);
       return emp.getBaseSalary()+(int)(adjustment.overtimeAddition()*((hours/126.0)*emp.getBaseSalary()));
    }
}
