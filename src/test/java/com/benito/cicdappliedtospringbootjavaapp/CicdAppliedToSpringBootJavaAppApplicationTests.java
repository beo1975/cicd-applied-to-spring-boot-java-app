package com.benito.cicdappliedtospringbootjavaapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.benito.cicdappliedtospringbootjavaapp.controller.HelloController;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CicdAppliedToSpringBootJavaAppApplicationTests {
	
	@Autowired
	private HelloController helloController;

	@Test
	public void contextLoads() {
		
		assertEquals("Hello World from DZONE",helloController.home() );
	}

}
