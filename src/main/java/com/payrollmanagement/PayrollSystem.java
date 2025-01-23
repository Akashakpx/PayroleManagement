package com.payrollmanagement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PayrollSystem  {
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

    public Optional<Employee> searchByName(String name){
        for(Employee e:employeesList){
            if(e.getName().equals(name)){
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }

    public Optional<Employee> searchByDepartment(String department){
        for(Employee e:employeesList){
            if(e.getDepartment().equals(department)){
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }

    public void sort(){
        employeesList = employeesList.stream().sorted().collect(Collectors.toList());
    }

    public void sortWithComparator(Comparator<Employee> comp){
        employeesList = employeesList.stream().sorted(comp).collect(Collectors.toList());
    }
    public void printAllEmployee(){
        for(Employee e:employeesList){
            System.out.println(e.toString());
        }
    }
}
