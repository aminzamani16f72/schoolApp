package com.example.demo;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Scanner;
@Service
public class SchoolApp extends Thread{
    private final SchoolService schoolService;

    public SchoolApp(SchoolService schoolService) {
        this.schoolService = schoolService;
        this.start();
        System.out.println("salam");
    }

    public void init(){
        try(Scanner scanner = new Scanner(System.in)) {
            boolean runLoop = true;
            do {
                System.out.println("press 1 to add student");
                System.out.println("press 2 to show list of students");
                System.out.println("press 3 to exit");
                int input = scanner.nextInt();
                scanner.nextLine();
                switch (input) {
                    case 1 -> {
                        try {
                            System.out.println("enter student name");
                            var studentName = (scanner.nextLine());
                            System.out.println("enter student family");
                            var studentFamily = (scanner.nextLine());
                            System.out.println("enter student age");
                            var studentAge = Integer.parseInt(scanner.nextLine());
                            System.out.println("enter student mark");
                            var studentMark = Integer.parseInt(scanner.nextLine());
                            schoolService.addStudent(new Student(studentName, studentFamily, studentAge, studentMark));

                        } catch (NumberFormatException e) {
                            System.out.println("Fill in all the entries");
                        }
                    }
                    case 2 -> System.out.println(Arrays.toString(schoolService.getStudents().toArray()));
                    case 3 -> runLoop = false;
                    default -> System.out.println("press valid key");
                }
            } while (runLoop);

        }
    }
    public void run() {
        this.init();
    }
}
