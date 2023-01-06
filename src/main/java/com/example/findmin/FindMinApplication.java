package com.example.findmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class FindMinApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(FindMinApplication.class, args);
        File newFile = new File("content.txt");

//        if(newFile.createNewFile()) {
//            FileWriter writer = new FileWriter("content.txt");
//            for (int i = 0; i < 500000; i++) {
//                writer.write((int) (Math.random() * 10000) + "\n");
//            }
//            writer.close();
//        }

        Scanner reader = new Scanner(newFile);
        int minimum = reader.nextInt();
        int line = 1;
        int currentLine = 1;
        while (reader.hasNextInt()) {
            int number = reader.nextInt();
            if (minimum > number) {
                minimum = number;
                line = currentLine;
            }
            currentLine++;
        }
        System.out.println("Minimum: " + minimum + ", line: " + line);
    }

}
