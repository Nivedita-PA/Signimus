package com.Nivedita;

import com.Nivedita.Task2.NumberGuessingGame;
import com.Nivedita.Task3.Car;
import com.Nivedita.Task4.BankAccount;
import com.Nivedita.Task5.Student;
import com.Nivedita.Task6.methodOverloading.Calculator;
import com.Nivedita.Task6.methodOverriding.Dog;

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
        Calculator c1 = new Calculator();
        c1.add("Hi ","Nivedita");
        c1.add(10,20);
        c1.add(10,20,30);
        Dog d1 = new Dog();
        System.out.println(d1.sound());
    }
}
