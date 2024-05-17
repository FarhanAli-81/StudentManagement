package com.example.StudentManagement.Service;

import com.example.StudentManagement.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public List<Student> getAllStudents();

    void save(Student student);

    Student findById(Long id);

    void deleteById(Long id);


}
