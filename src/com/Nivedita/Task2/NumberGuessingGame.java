package com.Nivedita.Task2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void guessTheNumberGame(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100)+1;
        System.out.println("Guess the number within the range of 1-100, you'll be given 5 trials");
        int guess = 0;
        for(int i=0; i<6; i++){
            guess = sc.nextInt();
            if(guess==number){
                break;
            }else if(guess<number){
                System.out.println("Enter a greater value");
            }else{
                System.out.println("Enter a lesser value");
            }
        }
        if(guess==number){
            System.out.println("Congratulations you have won !");
        }else{
            System.out.println("You have exhausted all the trials :( ");
            System.out.println("The number was "+ number);
        }
    }
}
