package com.example.demo;


import org.springframework.stereotype.Component;

import java.util.HashSet;
@Component
public class School {
    private static final HashSet<Student> students=new HashSet<>();

    public School() {
    }

    public  HashSet<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }


}
