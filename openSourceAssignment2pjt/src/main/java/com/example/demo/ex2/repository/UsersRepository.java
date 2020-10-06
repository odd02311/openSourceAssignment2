package com.example.demo.ex2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ex2.domain.Users;

public interface UsersRepository extends JpaRepository<Users, String> {

	@EntityGraph(type = EntityGraphType.FETCH, attributePaths = { "orders" })
	List<Users> findAll();

//	@Query("SELECT u FROM Users u join fetch u.orders")
//	List<Users> findAll();
}
