package com.example.StudentManagement.Controller;


import com.example.StudentManagement.Entity.Student;
import com.example.StudentManagement.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        super();
        this.studentService=studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String addStudentForm(Model model){
        Student s= new Student();
        model.addAttribute("student",s);
        return "addStudent";
    }

    @PostMapping("/students")
    public String insertIntoDataBase(@ModelAttribute("student") Student student){
        studentService.save(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String update(Model model, @PathVariable("id") Long id){
        Student s=studentService.findById(id);
        model.addAttribute("student", s);
        return "update";
    }

    @PostMapping("/saveEditted")
    public String saveEditted(@ModelAttribute("student") Student student){
//        System.out.println(student.getId());
        Student s=studentService.findById(student.getId());
        s.setFirstName(student.getFirstName());
        s.setEmail(student.getEmail());
        s.setLastName(student.getLastName());

//        studentService.deleteById(student.getId());
//        Student s=studentService.findById()
//        studentService.update(student);
        studentService.save(student);
        return "redirect:/students";
    }

    @GetMapping("/students/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        studentService.deleteById(id);
        return "redirect:/students";
    }


}
