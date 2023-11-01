package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class StudentRestCotroller {

    //define enpoint for "/students" - return a list of students
    private List<Student> Students = new ArrayList<>(); 
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> thStudents = new ArrayList<>();

        thStudents.add(new Student("James", "Porquinho"));
        thStudents.add(new Student("Fernando","Ibrahim"));
        return thStudents;
    }
    
}
