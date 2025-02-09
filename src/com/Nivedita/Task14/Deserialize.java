package com.Nivedita.Task14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialize {
    public static void main(String[] args) {
        try{
            FileInputStream fos = new FileInputStream("obj.txt");
            ObjectInputStream oos = new ObjectInputStream(fos);
            Student student = (Student) oos.readObject();
            System.out.println(student.getName());
            System.out.println(student.getMarks());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
