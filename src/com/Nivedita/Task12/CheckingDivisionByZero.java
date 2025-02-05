package com.Nivedita.Task12;

import java.util.Scanner;

public class CheckingDivisionByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  =  sc.nextInt();
        int b = sc.nextInt();
        try{
            int c = a/b;
            System.out.println("the value of the equation a/b is "+ c);
        }catch (ArithmeticException e){
            System.out.println("Arithematic exception has occured :" +e.getMessage());
        }
    }
}
