package com.example.demo;

import org.junit.jupiter.api.Test;


import java.util.HashSet;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SchoolTest {

    @Test
    void getStudent() {

        School school=new School();
        school.addStudent(new Student("amin","zamani",30,18));
        school.addStudent(new Student("amin","zamani",30,18));
        school.addStudent(new Student("parham", "ahmadi", 15, 80));
        assertNotNull(school.getStudents());
        assertEquals(2,school.getStudents().size());


    }
}