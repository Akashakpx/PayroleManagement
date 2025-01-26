package com.payrollmanagement;

public class TotalPayCalculator {
    BonusCalculator bonusCalculator = (salary) -> {
        if(salary<=0){
            throw new IllegalArgumentException("salary can't be 0 or less");
        }
        return salary*0.10;
    };
    SalaryCalculator salaryCalculator = (salary) ->{
        if(salary<=0){
            throw new IllegalArgumentException("slary can't be 0 or less");
        }
        return salary;
    };

    public static void main(String[] args) {
        Employee e = new FullTimeEmployee(1,"Akash","IT",50000,1000);
        TotalPayCalculator obj = new TotalPayCalculator();
        System.out.println("Total Pay: " + (obj.bonusCalculator.calculateBonus(e.getBaseSalary()) + obj.salaryCalculator.calculate(e.getBaseSalary())));
    }

}
