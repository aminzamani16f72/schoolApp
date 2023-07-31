package com.example.demo;

import java.util.HashSet;

public class School {
     HashSet<Student> students=new HashSet<>();

    public School() {
    }

    public HashSet<Student> getStudents() {
        return students;
    }

    public  void addStudent(){
        Student student=new Student();
        students.add(student.createStudent());
    }


}
