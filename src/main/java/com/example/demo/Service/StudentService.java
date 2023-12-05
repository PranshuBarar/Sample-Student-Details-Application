package com.example.demo.Service;

import com.example.demo.Entities.StudentDetails;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(StudentDetails studentDetails){
        String studentName = studentDetails.getStudentName();
        if(studentRepository.existsByStudentName(studentName)){
            return "Student already exists";
        }
        else studentRepository.save(studentDetails);
        return "Student Added Successfully";
    }

    @Transactional
    public String removeStudent(String studentName){
        if(studentRepository.existsByStudentName(studentName)){
            studentRepository.deleteByStudentName(studentName);
            return "Student Deleted Successfully";
        }
        else return "Student Not found";
    }

    public List<StudentDetails> getStudentList(){
        return studentRepository.findAll();
    }
}
