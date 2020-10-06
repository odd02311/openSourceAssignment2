package com.example.demo.ex4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ex4.domain.School;

public interface SchoolRepository extends JpaRepository<School, Long>{

}
