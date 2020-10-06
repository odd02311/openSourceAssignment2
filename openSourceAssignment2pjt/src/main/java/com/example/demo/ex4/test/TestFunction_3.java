package com.example.demo.ex4.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.ex4.domain.School;
import com.example.demo.ex4.domain.Student;
import com.example.demo.ex4.repository.SchoolRepository;
import com.example.demo.ex4.repository.StudentRepository;

@Component
public class TestFunction_3 {

	@Autowired
	private SchoolRepository schoolRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Transactional
	public void test() {
		School school = new School();
		school.setName("School name");
		school = schoolRepository.save(school);

		Student student = new Student();
		student.setName("Student name");

		school.addStudent(student);
		studentRepository.save(student);
	}
}
