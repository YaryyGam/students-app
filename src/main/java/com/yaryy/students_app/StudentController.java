package com.yaryy.students_app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        return List.of(
            new Student(1, "Den", 21),
            new Student(1, "Ben", 23),
            new Student(1, "Rayan", 276)
        );
    }
}
