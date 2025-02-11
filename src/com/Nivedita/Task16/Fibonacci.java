package com.Nivedita.Task16;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacci(5,0,1);
    }
    public static void printFibonacci(int n, int a, int b) {
        // Base case: Stop if the next number exceeds n
        if (a > n) {
            return;
        }
        // Print the current Fibonacci number
        System.out.print(a + " ");
        printFibonacci(n, b, a + b);
    }
}
