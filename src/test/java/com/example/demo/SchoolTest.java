package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SchoolTest {

    @Test
    void addStudent() {


        var mockScanner=mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn(String.class.toString());
        when(mockScanner.nextInt()).thenReturn(15);
        School school=new School(mockScanner);
        school.addStudent();
        school.addStudent();
        assertEquals(school.getStudents().size(),1);
//        assertEquals(school.getStudents().stream().collect(Collectors.toList()).get(0).getName(),"amin" );

    }

    @Test
    void getStudent(){

    }
}