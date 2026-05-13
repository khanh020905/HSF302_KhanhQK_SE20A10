package com.example.demo.Repository;

import com.example.demo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public Student save();
    public Optional<Student> findById(int id);
    public boolean deleteById(int id);
    public boolean update(Student student);
    public List<Student> findAll();
}
