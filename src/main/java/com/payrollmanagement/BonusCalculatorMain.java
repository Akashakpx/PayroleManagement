package com.payrollmanagement;

public class BonusCalculatorMain {
    public static void main(String[] args) {
        Employee e = new FullTimeEmployee(1,"Akash","IT",50000,1000);
        BonusCalculator bonusCalculator = (salary)->{
            if(salary<=0){
                throw new IllegalArgumentException("salary can't be negative or zero");
            }
            return salary*0.10;
        };
        System.out.println(bonusCalculator.calculateBonus(e.getBaseSalary()));
    }
}
