package com.example.demo.ex2;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.ex2.test.TestFunction_2;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class QueryTest {

	@Autowired
	TestFunction_2 testFunction_2;

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void test() throws Exception {
		testFunction_2.test();
		mvc.perform(get("/ex2/test"));
	}
}
