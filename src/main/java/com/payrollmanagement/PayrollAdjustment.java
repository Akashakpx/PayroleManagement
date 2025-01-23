package com.payrollmanagement;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PayrollAdjustment {
    double taxRate() default 0.20;
    double overtimeAddition() default 0.40;
}
