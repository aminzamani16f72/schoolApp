package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class SchoolApp {

    public static void main(String[] args) {
        SpringApplication.run(SchoolApp.class, args);
        Scanner scanner = new Scanner(System.in);
        boolean runLoop=true;
        do{
            System.out.println("press 1 to add student");
            System.out.println("press 2 to show list of students");
            System.out.println("press 3 to exit");
            int input = scanner.nextInt();
            switch (input) {
                case 1 -> addStudent();
                case 2 -> showListOfStudents();
                case 3 ->runLoop=false;
                default -> System.out.println("press valid key");
            }
        }while (runLoop);
        scanner.close();
    }

    public static void addStudent() {
        School school=new School();
        school.addStudent();
    }
    public static void showListOfStudents() {
        School school=new School();
        System.out.println(Arrays.toString(school.getStudents().toArray()));
    }

    }


