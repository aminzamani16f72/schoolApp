package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class SchoolService {
    private final Repository repository;
    public SchoolService(Repository repository) {
        this.repository = repository;
    }
    public List<Student> getStudents(){
       return repository.findAll();
    }
    public void addStudent(Student student){
        repository.save(student);
    }

}
