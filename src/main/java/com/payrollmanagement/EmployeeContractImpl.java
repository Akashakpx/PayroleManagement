package com.payrollmanagement;

public class EmployeeContractImpl {
    public static void main(String[] args){
        Employee [] employeesList = {
                new FullTimeEmployee(1,"Akash","Software",5000,1000),
                new PartTimeEmployee(2,"Ram","Marketing",4000,50),
                new FullTimeEmployee(3,"Ramesh","Mechanical",8000,1100)
        };
        for(Employee i:employeesList){
            System.out.println("Work Hours and assignedProject of Employee having Id "+i.getEmployeeId()+", name "+i.getName()+" working on department "+i.getDepartment()+" is "+i.defineWorkHours()+" and "+i.assignProject()+" respectively.");
        }

    }
}
