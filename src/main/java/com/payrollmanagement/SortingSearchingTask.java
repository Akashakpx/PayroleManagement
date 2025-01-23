package com.payrollmanagement;

import java.util.Comparator;

public class SortingSearchingTask {
    public static void main(String[] args) {
        PayrollSystem ps = new PayrollSystem();
        ps.addEmployee(new FullTimeEmployee(2,"Akash","IT",50000,10000));
        ps.addEmployee(new FullTimeEmployee(1,"Vikram","Testing",80000,5000));
        Comparator<Employee> comp = new Comparator<>(){
            @Override
            public int compare(Employee a,Employee b){
                if(a==null){
                    return 1;
                }
                if(b==null){
                    return -1;
                }
                if(a.getDepartment().compareTo(b.getDepartment())==0){
                    if(a.getEmployeeId()>b.getEmployeeId()){
                        return 1;
                    }else if(a.getEmployeeId()==b.getEmployeeId()){
                        return 0;
                    }else{
                        return -1;
                    }
                }else{
                    return a.getDepartment().compareTo(b.getDepartment());
                }
            }
        };
        ps.sort();
        System.out.println("Sorting using comparable");
        ps.printAllEmployee();
        ps.sortWithComparator(comp);
        System.out.println("Sorting using comparator");
        ps.printAllEmployee();

        if(ps.searchByName("Akash").isPresent()){
            System.out.println("Searched by Name('Akash') : "+ps.searchByName("Akash"));
        }else{
            System.out.println("No Match Found");
        }
        if(ps.searchByDepartment("Testing").isPresent()){
            System.out.println("Searched by Department('Testing') : "+ps.searchByDepartment("Testing"));
        }else{
            System.out.println("No Match Found");
        }
    }

}
