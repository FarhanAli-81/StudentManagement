package com.example.StudentManagement;

import com.example.StudentManagement.Entity.Student;
import com.example.StudentManagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication  {
//implements CommandLineRunner
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

//	@Autowired
//	private StudentRepository studentRepository;
//	@Override
//	public void run(String... args) throws Exception {
//		Student s1=Student.builder().firstName("farhan").lastName("ali").email("farhanalimd313@gmail.com").build();
//		Student s2=Student.builder().firstName("Mohammad").lastName("ali").email("21211a05g9@bvrit.ac.in").build();
//		Student s3=Student.builder().firstName("AbuBakar").lastName("Umar").email("farhanalimd81@gmail.com").build();
//	    studentRepository.save(s1);
//		studentRepository.save(s2);
//		studentRepository.save(s3);

}

