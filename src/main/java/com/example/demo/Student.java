package com.example.demo;


import java.util.Objects;
import java.util.Scanner;

public class Student {
    private  String name;
    private  String family;
    private  int age;

    private  int mark;

    public String getName() {
        return name;
    }

    public Student(String name, String family, int age, int mark) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.mark = mark;
    }

    public Student() {
    }
    public  Student createStudent(Scanner scanner){
        System.out.println("enter student name");
        var studentName=(scanner.nextLine());
        System.out.println("enter student family");
        var studentFamily=(scanner.nextLine());
        System.out.println("enter student age");
        var studentAge=(scanner.nextInt());
        System.out.println("enter student mark");
        var studentMark=(scanner.nextInt());
        return new Student(studentName,studentFamily,studentAge,studentMark);
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(family, student.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, family, age);
    }
}

