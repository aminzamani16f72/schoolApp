package com.example.demo;




import java.util.Objects;

public class Student {
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
}

