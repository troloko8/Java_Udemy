package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public class StudentRepo {

    public void save(Student s) {
        System.err.println("Added");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<Student>();
        return students;
    }

}
