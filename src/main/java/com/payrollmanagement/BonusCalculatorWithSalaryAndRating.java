package com.payrollmanagement;

@FunctionalInterface
public interface BonusCalculatorWithSalaryAndRating {
    double calculateBonus(double salary,double rating);
}
