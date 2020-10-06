package com.example.demo.ex4;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import com.example.demo.ex4.test.TestFunction_3;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class StackOverflowTest {

	@Autowired
	TestFunction_3 testFunction_3;

	@Autowired
	private MockMvc mvc;

	@Test
	public void test() throws Exception {
		testFunction_3.test();
		mvc.perform(get("/ex4/student")).andDo(MockMvcResultHandlers.print());
	}
}
