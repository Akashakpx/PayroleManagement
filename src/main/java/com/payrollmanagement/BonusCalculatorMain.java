package com.payrollmanagement;

public class BonusCalculatorMain {
    public static void main(String[] args) {
        Employee e = new FullTimeEmployee(1,"Akash","IT",50000,1000);
        BonusCalculatorWithSalaryAndRating bonusCalculatorWithSalaryAndRating = (salary,rating)->{
            return salary*salary*(rating/5);
        };
        System.out.println(bonusCalculatorWithSalaryAndRating.calculateBonus(e.getBaseSalary(),4.5));
    }
}
