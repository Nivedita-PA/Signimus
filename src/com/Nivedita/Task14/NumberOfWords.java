package com.Nivedita.Task14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfWords {
    public static void main(String[] args) {
       try{
           BufferedReader br = new BufferedReader(new FileReader("numofwords.txt"));
           String line;
           int wordcount = 0;
           while((line=br.readLine())!=null){
               String[] words = line.trim().split("\\s+");
               wordcount += words.length;
           }
           System.out.println("Total word count: " + wordcount);
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
}
