package com.Nivedita.Task21;

public class Varargs {
    public static double calculateAverage(double...numbers){
        if(numbers.length==0){
            throw new IllegalArgumentException("You have to give at least single value");
        }
        double sum = 0;
        for(double i:numbers){
            sum += i;
        }
        return sum/numbers.length;
    }

    public static void main(String[] args) {
        System.out.println(calculateAverage(12.0,13.89,4.55,5,8));
    }
}
