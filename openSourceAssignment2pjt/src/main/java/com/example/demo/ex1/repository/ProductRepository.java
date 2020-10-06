package com.example.demo.ex1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.ex1.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("DELETE FROM Product p WHERE p.seq in :seq")
	@Transactional
	@Modifying
	
	void deleteBySeqIn(@Param("seq") Long... seq);
}
	