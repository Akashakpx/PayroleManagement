package com.payrollmanagement;

@FunctionalInterface
interface SalaryCalculator {
    double calculate(double basePay);
}