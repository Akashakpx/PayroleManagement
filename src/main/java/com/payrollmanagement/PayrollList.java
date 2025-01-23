package com.payrollmanagement;

import java.util.List;
import java.util.Set;

public class PayrollList<T> {
    private T data;
    public PayrollList(T data){
        this.data = data;
    }

    public void addPayroll(Payroll p){
        if(data instanceof List){
            ((List<Payroll>) data).add(p);
        }else if(data instanceof Set){
            ((Set<Payroll>)data).add(p);
        }
    }

    public void printTaxDeductionAndOvertimeAddition(int hours) throws NoSuchMethodException {
        if(data instanceof List){
            List<Payroll> payrollList = (List<Payroll>) data;
            for(Payroll payroll: payrollList){
                System.out.println("salary after taxDeduction : " + payroll.taxDeduction());
                System.out.println("salary after overtimeCostAddition : " + payroll.overtimeCostAddition(hours));
            }
        }else if(data instanceof Set){
            Set<Payroll> payrollSet = (Set<Payroll>) data;
            for(Payroll payroll:payrollSet) {
                System.out.println("salary after taxDeduction : " + payroll.taxDeduction());
                System.out.println("salary after overtimeCostAddition : " + payroll.overtimeCostAddition(hours));
            }
        }
    }

}
