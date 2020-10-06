package com.example.demo.ex2.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ex2.domain.Users;
import com.example.demo.ex2.repository.UsersRepository;

@RestController
public class Contoller {

	@Autowired
	private UsersRepository userRepository;

	@GetMapping("/ex2/test")
	public List<Users> findAll() {
		return userRepository.findAll();
	}
}
