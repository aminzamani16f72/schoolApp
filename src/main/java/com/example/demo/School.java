package com.example.demo;


import org.springframework.stereotype.Service;

import java.util.HashSet;
@Service
public class School {
    private static final HashSet<Student> students=new HashSet<>();

    public  HashSet<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }


}
