package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    private final SchoolService schoolService;

    public Controller(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping("student")
    public void listOfStudent(@RequestBody String student) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Student studentObject = mapper.readValue(student,Student.class);
        schoolService.addStudent(studentObject);
        System.out.println(student);


    }

    @GetMapping(value = "student")
    public List<Student> getStudentCollection() {
        return schoolService.getStudents();
    }
}
