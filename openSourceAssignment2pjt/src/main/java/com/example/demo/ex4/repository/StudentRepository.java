package com.example.demo.ex4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ex4.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
