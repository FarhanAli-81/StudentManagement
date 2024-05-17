package com.example.StudentManagement.Service;


import com.example.StudentManagement.Entity.Student;
import com.example.StudentManagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements  StudentService{


//    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository){
        super();
        this.studentRepository=studentRepository;
    }


    public List<Student> getAllStudents(){
     return    studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findById(Long id) {
        return studentRepository
                .findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
         studentRepository.deleteById(id);
    }



}
