package com.Nivedita;

import com.Nivedita.Task7.Abstract.Circle;
import com.Nivedita.Task7.Abstract.Rectangle;
import com.Nivedita.Task7.EmployeeManagementSystem.Employee;
import com.Nivedita.Task7.EmployeeManagementSystem.EmployeeManager;
import com.Nivedita.Task7.EmployeeManagementSystem.Intern;
import com.Nivedita.Task7.EmployeeManagementSystem.Manager;
import com.Nivedita.Task7.Interface.CreditCardPayment;
import com.Nivedita.Task7.Interface.PayPalPayment;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Task 2
//        NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
//        numberGuessingGame.guessTheNumberGame();
        //Task 3
//        Car car1 = new Car("BMW","Black",100);
//        Car car2 = new Car();
//        car2.brand = "Audi";
//        car2.colour = "Red";
//        car2.speed = 105;
//        System.out.println(car1);
//        System.out.println(car2);
//        car1.start();
//        car1.accelerate();
//        car1.stop();

        // Task 4
//        BankAccount bankAccount1 = new BankAccount();
//        bankAccount1.setAccountNumber("1");
//        bankAccount1.setAccountHolder("Nivedita");
//        bankAccount1.setAccountBalance(0);
//
//        System.out.println(bankAccount1.depositMoney(500));
//        System.out.println(bankAccount1.getAccountBalance());
//        System.out.println(bankAccount1.withdrawMoney(5000));
//        System.out.println(bankAccount1.getAccountBalance());
//        System.out.println(bankAccount1.withdrawMoney(100));
//        System.out.println(bankAccount1.getAccountBalance());
//        bankAccount1.withdrawMoney(100);
//        System.out.println(bankAccount1.getAccountBalance());

        //Task 5
//        Student s1 = new Student(28,"Nivedita", 1020, "science");

        //Task 6
//        Calculator c1 = new Calculator();
//        c1.add("Hi ","Nivedita");
//        c1.add(10,20);
//        c1.add(10,20,30);
//        Dog d1 = new Dog();
//        System.out.println(d1.sound());

          //Task 7
//          Circle circle = new Circle(5);
//          Rectangle rectangle = new Rectangle(2,8);
//          System.out.println("area of circle: "+circle.calculateArea());
//          System.out.println("area of rectangle: "+rectangle.calculateArea());
//
//          PayPalPayment payPalPayment = new PayPalPayment();
//          System.out.println(payPalPayment.pay(500));
//          System.out.println(payPalPayment.refund(200));
//          CreditCardPayment creditCardPayment = new CreditCardPayment();
//          System.out.println(creditCardPayment.pay(700));
//          System.out.println(creditCardPayment.refund(300));

          //Employee Management System
          EmployeeManager employeeManager = new EmployeeManager();
          Employee employee1 = new Employee(101,"Nivedita");
          Manager manager = new Manager(102,"Lakshya",1000);
          Intern intern = new Intern(103,"Ria",4);
          Employee employee2 = new Employee(104,"Keshav");
          employeeManager.addEmployee(employee1);
          employeeManager.addEmployee(employee2);
          employeeManager.addEmployee(manager);
          employeeManager.addEmployee(intern);
          employeeManager.removeEmployee(employee2);
          employeeManager.displayEmployee();


    }
}
