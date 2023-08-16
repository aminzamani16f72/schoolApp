package com.example.demo;






import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Table
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    private final String name;
    private final String family;
    private final int age;

    private  int mark;



    public Student() {
        this.name="";
        this.age=0;
        this.mark=0;
        this.family="";
    }

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

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
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


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

