package com.example.demo.ex1.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.ex1.domain.Product;
import com.example.demo.ex1.domain.User;
import com.example.demo.ex1.repository.ProductRepository;
import com.example.demo.ex1.repository.UserRepository;

@Component
public class TestFunction_1 {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ProductRepository productRepository;

	@Transactional
	public void test() {
		User user = new User();
		user.setId("User ID");
		user.setName("User name");
		user = userRepository.save(user);

		System.out.println(user.getId());

		Product product_1 = new Product();
		product_1.setName("Product_1");

		Product product_2 = new Product();
		product_2.setName("Product_2");

		Product product_3 = new Product();
		product_3.setName("Product_3");

		user.addProduct(product_1);
		user.addProduct(product_2);
		user.addProduct(product_3);

		product_1 = productRepository.save(product_1);
		product_2 = productRepository.save(product_2);
		product_3 = productRepository.save(product_3);

		productRepository.deleteBySeqIn(product_1.getSeq(), product_2.getSeq(), product_3.getSeq());
	}
}
