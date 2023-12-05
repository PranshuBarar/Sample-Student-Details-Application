package com.example.demo.Controllers;

import com.example.demo.Entities.StudentDetails;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    public ResponseEntity<String> hello(){
        String response = "Hi, how are you?";
        return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }
    @PostMapping("/add")
    public ResponseEntity<String> addStudent(@RequestBody StudentDetails studentDetails){
        String response = studentService.addStudent((studentDetails));
        return new ResponseEntity<String>(response, HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/remove")
    public ResponseEntity<String> removeStudent(@RequestParam("studentName") String studentName){
        String response = studentService.removeStudent(studentName);
        return new ResponseEntity<String>(response,HttpStatus.ACCEPTED);
    }
    @GetMapping("/getlist")
    public ResponseEntity<List<StudentDetails>> listOfAllStudents(){
        List<StudentDetails> listOfAllStudents = studentService.getStudentList();
        return new ResponseEntity<>(listOfAllStudents,HttpStatus.ACCEPTED);
    }
}
