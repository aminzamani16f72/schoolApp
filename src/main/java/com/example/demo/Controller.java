package com.example.demo;

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

    public Controller(School school) {
        this.school = school;
    }

    @PostMapping("student")
    public ResponseEntity<HashSet<Student>> listOfStudent(@RequestBody JsonNode jsonNode){
        ObjectMapper mapper = new ObjectMapper();
        Student student = mapper.readValues(jsonstudent,Student.class);

    }
}
