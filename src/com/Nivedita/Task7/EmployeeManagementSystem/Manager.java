package com.Nivedita.Task7.EmployeeManagementSystem;

public class Manager extends Employee{
     private int managerCredit;

     public Manager(int employeeID, String employeeName,int managerCredit) {
          super(employeeID, employeeName);
          this.managerCredit = managerCredit;
     }

     public int getManagerCredit() {
          return managerCredit;
     }

     public void setManagerCredit(int managerCredit) {
          this.managerCredit = managerCredit;
     }

     @Override
     public void displayEmployee() {
          super.displayEmployee();
          System.out.println("Manager credit: "+ managerCredit);
     }
}
