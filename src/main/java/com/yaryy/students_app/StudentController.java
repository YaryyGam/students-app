package com.yaryy.students_app;

import com.yaryy.students_app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        return service.findAll();
    }
    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        service.addNewStudent(student);
    }
}
//docker-compose up --build
//docker-compose down