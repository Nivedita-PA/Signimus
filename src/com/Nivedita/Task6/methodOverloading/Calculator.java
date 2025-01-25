package com.Nivedita.Task6.methodOverloading;

public class Calculator {
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void add(String a, String b){
        System.out.println(a+b);
    }
}
