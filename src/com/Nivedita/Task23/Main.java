package com.Nivedita.Task23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student("Nivedita","Pal", 28, 160),
                new Student("Uday","Paul", 29, 175),
                new Student("Bhaskar","Sunchu", 26, 169),
                new Student("Niki","Pal", 28, 190)));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
        Collections.sort(students, new StudentComparator());
        System.out.println(students);


    }
}
