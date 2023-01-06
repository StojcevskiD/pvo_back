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

    public static void main(String[] args) {
        SpringApplication.run(FindMinApplication.class, args);
    }
}
