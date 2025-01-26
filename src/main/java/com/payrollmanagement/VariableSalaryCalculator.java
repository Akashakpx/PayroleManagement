package com.payrollmanagement;

@FunctionalInterface
interface VariableSalaryCalculator {
    double calculate(double baseSalary, double percentage);
}
