package com.Nivedita.Task12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OpenCloseResourcesInFinallyBlock {
    public static void main(String[] args){
        BufferedReader reader =  null;
        try {
            reader  = new BufferedReader(new FileReader("test.txt"));
            System.out.println("File opened successfully");
        }catch (FileNotFoundException e) {
            System.out.println("Error: file not found");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File closed successfully");
                }
            } catch (IOException e) {
                System.out.println("File not available");
            }
        }
    }
}
