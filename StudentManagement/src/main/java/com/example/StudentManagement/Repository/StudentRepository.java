package com.example.StudentManagement.Repository;


import com.example.StudentManagement.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository

public interface StudentRepository extends JpaRepository<Student, Long> {
}
