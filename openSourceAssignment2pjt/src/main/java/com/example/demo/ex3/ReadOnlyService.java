package com.example.demo.ex3;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.ex2.domain.Users;
import com.example.demo.ex2.repository.UsersRepository;

@Service
public class ReadOnlyService {

	private UsersRepository usersRepository;

	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public List<Users> findAll() {
		return usersRepository.findAll();
	}
}
