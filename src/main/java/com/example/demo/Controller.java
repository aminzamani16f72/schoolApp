package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
public class Controller {

    private final School school;

    @Autowired
    public Controller(School school) {
        this.school = school;
    }

    @PostMapping("student")
    public void listOfStudent(@RequestBody String student) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Student studentObject = mapper.readValue(student,Student.class);
        school.addStudent(studentObject);
        System.out.println(student);


    }

    @GetMapping(value = "student")
    public HashSet<Student> getStudentCollection() throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
        return school.getStudents();
    }
}
