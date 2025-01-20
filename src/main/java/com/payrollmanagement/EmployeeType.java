package com.payrollmanagement;

public abstract class EmployeeType {
    private int workHours;
    public abstract void calculateWorkHours();

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        if(workHours<=0){
            throw new IllegalArgumentException("Work hours cannot be less than or equal to 0");
        }
        this.workHours = workHours;
    }
}
