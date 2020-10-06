package com.example.demo.ex2.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.ex2.domain.Order;
import com.example.demo.ex2.domain.Users;
import com.example.demo.ex2.repository.OrderRepository;
import com.example.demo.ex2.repository.UsersRepository;

@Component
public class TestFunction_2 {

	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Transactional
	public void test() {
		Users user_1 = new Users();
		user_1.setId("User ID_1");
		user_1.setName("User Name");

		user_1 = usersRepository.save(user_1);

		Users user_2 = new Users();
		user_2.setId("User ID_2");
		user_2.setName("User name");
		
		user_2 = usersRepository.save(user_2);

		Users user_3 = new Users();
		user_3.setId("User ID 3");
		user_3.setName("User name");
		
		user_3 = usersRepository.save(user_3);

		Order order_1 = new Order();
		order_1.setMsg("Order msg_1");

		Order order_2 = new Order();
		order_2.setMsg("Order msg_2");

		Order order_3 = new Order();
		order_3.setMsg("Order msg_3");

		user_1.order(order_1);
		user_2.order(order_2);
		user_3.order(order_3);

		orderRepository.save(order_1);
		orderRepository.save(order_2);
		orderRepository.save(order_3);
	}

}
