package com.example.demo.ex2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ex2.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
