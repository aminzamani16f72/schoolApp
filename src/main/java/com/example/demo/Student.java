package com.example.demo;


import org.springframework.stereotype.Component;

import java.util.Objects;

public class Student {
    private final String name;
    private final String family;
    private final int age;

    private  int mark;



    public Student(String name, String family, int age, int mark) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.mark = mark;
    }

    public Student(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
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

