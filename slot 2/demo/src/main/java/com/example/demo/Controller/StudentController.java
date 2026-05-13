package com.example.demo.Controller;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        Student saveStudent = studentService.saveStudent(student);
        return ResponseEntity.ok(saveStudent);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Student updateStudent = studentService.updateStudent(student);
        return ResponseEntity.ok(updateStudent);
    }

    @GetMapping("{/id}")
    public ResponseEntity<Optional<Student>> findById(int id) {
        Optional<Student> student = studentService.findStudentById(id);
        return ResponseEntity.ok(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAllStudent() {
        List<Student> findAll = studentService.findAll();
        return ResponseEntity.ok(findAll);
    }

    @PostMapping("{/id}")
    public ResponseEntity<Boolean> deleteStudent(@RequestBody int id) {
        boolean deleteStudent = studentService.deleteStudent(id);
        return ResponseEntity.ok(deleteStudent);
    }
}
