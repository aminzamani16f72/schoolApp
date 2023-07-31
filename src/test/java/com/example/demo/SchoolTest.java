package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void getStudent() {
        School school=new School();

        var expectedStudents= school.getStudents();
        HashSet<Student> students=new HashSet<>();
        students.add(new Student("ali","javad",18,12));
        students.add(new Student("hossein","ghadiri",18,15));
        assertEquals(students,expectedStudents);
    }
}