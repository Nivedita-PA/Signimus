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
//          EmployeeManager employeeManager = new EmployeeManager();
//          Employee employee1 = new Employee(101,"Nivedita");
//          Manager manager = new Manager(102,"Lakshya",1000);
//          Intern intern = new Intern(103,"Ria",4);
//          Employee employee2 = new Employee(104,"Keshav");
//          employeeManager.addEmployee(employee1);
//          employeeManager.addEmployee(employee2);
//          employeeManager.addEmployee(manager);
//          employeeManager.addEmployee(intern);
//          employeeManager.removeEmployee(employee2);
//          employeeManager.displayEmployee();

            //Task 8
//            int arr[] = {7,5,6,8,9,10};
//
//            //Task 1
//            int sum = 0;
//            int avg = 0;
//            for (int ar:arr) {
//                sum += ar;
//            }
//           System.out.println("this is the sum: "+sum);
//           System.out.println("this is the average: "+ sum/arr.length);
//
//           //Task 2
//           int max = Integer.MIN_VALUE;
//           int min = Integer.MAX_VALUE;
//           for (int ar:arr) {
//                if(max<ar) max = ar;
//                if(min>ar) min = ar;
//           }
//           System.out.println("This is max val: "+max);
//           System.out.println("This is min val: "+min);
//
//           //Task 3
//          int matrix[][] = {{1,3},{34,65},{90,3}};
//          for(int i=0; i<matrix.length; i++){
//                for(int j=0; j<matrix[0].length; j++){
//                      System.out.print(matrix[i][j]+" ");
//                }
//                System.out.println();
//          }
         //Task 9
        // reverse a string;
        String name = "madam";
        String rev = "";
        for(int i=name.length()-1; i>=0; i--){
            rev += name.charAt(i);
        }
        System.out.println(rev);

        //palindrome
        boolean isPalindrome = true;
        int i=0;
        int j=name.length()-1;
        while(i<j){
            if(name.charAt(i)!=name.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println("Is "+ name + " a palindrome: "+isPalindrome);

        //count of char
        int count = 0;
        for(int k=0; k<name.length(); k++){
            if(name.charAt(k)=='m') count++;
        }
        System.out.println(count);

    }
}
