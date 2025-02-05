package com.Nivedita.Task12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
    public static void filedoesntexist() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        System.out.println("Reading file");
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        filedoesntexist();
    }
}
