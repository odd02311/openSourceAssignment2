package com.example.demo.ex4.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class School {
	@Id
	@GeneratedValue
	private Long seq;
	private String name;
	@OneToMany(mappedBy = "school")
	@JsonBackReference 
	private List<Student> student = new ArrayList<>();

	public void addStudent(Student student) {
		student.setSchool(this);
		this.student.add(student);
	}

	public Long getSeq() {
		return seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
}
