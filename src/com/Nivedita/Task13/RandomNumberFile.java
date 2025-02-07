package com.Nivedita.Task13;

import java.io.*;
import java.util.Random;

public class RandomNumberFile {
    public static void main(String[] args) throws IOException {
        String file = "numbers.txt";
        //writing random values to a text file
//        try {
//            BufferedWriter br = new BufferedWriter(new FileWriter(file));
//            Random random = new Random();
//            for(int i=0; i<100; i++){
//                int num = random.nextInt(100);
//                br.write(num + "\n");
//                br.flush();
//            }
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
        //summing the values written in the file
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            int sum = 0;
            String read;
            while((read = br.readLine())!=null){
                sum += Integer.parseInt(read);
            }
            System.out.println(sum);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        //COUNTING THE NO. OF LINES IN A FILE
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            int count = 0;
            String read;
            while((read = br.readLine())!=null){
                count++;
            }
            System.out.println(count);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //COPYING A BINARY FILE
        String source = "source.jpg";
        String destination = "destination.jpg";

        try{
            FileInputStream fis =  new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully");
        }catch (IOException e){
            System.out.println("Error copying file: "+e.getMessage());
        }

    }
}
