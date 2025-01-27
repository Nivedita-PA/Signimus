package com.Nivedita.Task7.EmployeeManagementSystem;

public class Intern extends Employee{
     private int durationInMonths;

     public Intern(int id, String name, int durationInMonths) {
          super(id,name);
          this.durationInMonths = durationInMonths;
     }

     public int getDurationInMonths() {
          return durationInMonths;
     }

     public void setDurationInMonths(int durationInMonths) {
          this.durationInMonths = durationInMonths;
     }

     @Override
     public void displayEmployee() {
          super.displayEmployee();
          System.out.println("Intern's duration: "+ durationInMonths);
     }
}
