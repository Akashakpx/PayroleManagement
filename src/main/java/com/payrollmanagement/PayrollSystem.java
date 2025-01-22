package com.payrollmanagement;

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Employee> employeesList;
    PayrollSystem(){
        employeesList = new ArrayList<>();
    }
    public void addEmployee(Employee e){
        employeesList.add(e);
    }
    public void removeEmployee(int employeeId){
        for(int i=0;i<employeesList.size();i++){
            if(employeesList.get(i).getEmployeeId()==employeeId){
                employeesList.remove(i);
                break;
            }
        }
    }
    public void printAllEmployee(){
        for(Employee e:employeesList){
            System.out.println(e.toString());
        }
    }
}
