package com.example.demo;

import java.util.HashSet;
import java.util.Scanner;

public class School {
     HashSet<Student> students=new HashSet<>();
    private Scanner scanner;
    public School(Scanner scanner) {
        this.scanner=scanner;

    }

    public HashSet<Student> getStudents() {
        return students;
    }

    public  void addStudent(){
        Student student=new Student();
        students.add(student.createStudent(this.scanner));
    }


}
