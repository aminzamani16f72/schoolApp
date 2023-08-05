package com.example.demo;

import java.util.HashSet;

public class School {
    private final HashSet<Student> students=new HashSet<>();


    public HashSet<Student> getStudents() {
        return students;
    }

    public  void addStudent(Student student){
        students.add(student);
    }


}
