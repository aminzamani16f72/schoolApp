package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

@SpringBootTest
class StudentTest {

    @Test
    void equalStudent(){
        Student a=new Student("ali","namazi",25,18);
        Assertions.assertEquals(a.hashCode(), Objects.hash("ali","namazi",25));
        Assertions.assertEquals(a, new Student("ali","namazi",25,21));
    }


}
