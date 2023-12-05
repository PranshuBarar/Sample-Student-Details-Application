package com.example.demo.Repository;

import com.example.demo.Entities.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails,Integer> {
    boolean existsByStudentName(String studentName);

    void deleteByStudentName(String studentName);
}
