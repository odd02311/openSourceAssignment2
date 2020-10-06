package com.example.demo.ex1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.ex1.test.TestFunction_1;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DeleteTest {

	@Autowired
	TestFunction_1 testFunction;

	@Test
	public void test() {
		testFunction.test();
	}
}
