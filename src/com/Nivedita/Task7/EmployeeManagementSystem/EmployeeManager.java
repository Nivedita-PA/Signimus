package com.Nivedita.Task7.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager implements EmployeeService{
    List<Employee> employees = new ArrayList<>();
    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
         this.employees.remove(employee);
    }

    @Override
    public void displayEmployee() {
        for (Employee employee:employees) {
            employee.displayEmployee();
        }
    }
}
