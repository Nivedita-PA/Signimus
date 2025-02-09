package com.Nivedita.Task14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {
    public static void main(String[] args) {
        try {
            Student student = new Student("Nivedita", 90);
            FileOutputStream fos = new FileOutputStream("obj.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            fos.close();
            oos.close();
            System.out.println("Object state is transferred to  file");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
