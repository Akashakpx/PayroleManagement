package com.payrollmanagement;

public class SalaryCalculation
{
    public static void main( String[] args )
    {
        Employee [] employeesList = {
                new FullTimeEmployee(1,"Akash","Software",5000,1000),
                new PartTimeEmployee(2,"Ram","Marketing",4000,50),
                new FullTimeEmployee(3,"Ramesh","Mechanical",8000,1100)
        };
        for(Employee i:employeesList){
            System.out.println("Salary Calculation of Employee having Id "+i.getEmployeeId()+", name "+i.getName()+" working on department "+i.getDepartment()+" is "+i.salaryCalculation());
        }
    }
}
