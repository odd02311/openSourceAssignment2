package com.example.demo.ex4.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ex4.domain.Student;
import com.example.demo.ex4.repository.StudentRepository;

@RestController
public class Test4_Contoller {

	@Autowired
	TestFunction_3 testFunction_3;

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("ex4/student")
	public List<Student> get() {
		return studentRepository.findAll();
	}
}
