package com.Nivedita.Task12;

public class AgeValidator {
    public static void ageValidate(int age) throws InvalidAgeException {
        if(age<0){
            throw new InvalidAgeException("Age cannot be negative");
        }
        System.out.println("Age is valid: " +age);
    }
    public static void main(String[] args) {
        try {
            ageValidate(-2);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
