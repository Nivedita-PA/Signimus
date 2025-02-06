package com.Nivedita.Task13;

import java.io.*;
import java.util.Random;

public class RandomNumberFile {
    public static void main(String[] args) throws IOException {
        String file = "numbers.txt";
        //writing random values to a text file
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(file));
            Random random = new Random();
            for(int i=0; i<100; i++){
                int num = random.nextInt(100);
                br.write(num + "\n");
                br.flush();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        //summing the values written in the file
//        try{
//            BufferedReader br = new BufferedReader(new FileReader(file));
//
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

    }
}
