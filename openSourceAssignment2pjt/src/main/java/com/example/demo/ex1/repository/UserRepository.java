package com.example.demo.ex1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ex1.domain.User;

public interface UserRepository extends JpaRepository<User, String> {
}
