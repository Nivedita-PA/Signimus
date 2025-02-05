package com.Nivedita.Task11;

public class Department {
    public void  displayEmployeeDetails(Employees employee){
        System.out.println("Employee ID: "+employee.getId());
        System.out.println("Employee name: "+  employee.getName());
        System.out.println("Employee position: "+ employee.getPosition());
        System.out.println("Employee salary: "+ employee.getSalary());
    }
}
