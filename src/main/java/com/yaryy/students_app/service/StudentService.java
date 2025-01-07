package com.yaryy.students_app.service;

import com.yaryy.students_app.Student;
import com.yaryy.students_app.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo repo;

    public List<Student> findAll() {
        return repo.findAll();
    }
}
