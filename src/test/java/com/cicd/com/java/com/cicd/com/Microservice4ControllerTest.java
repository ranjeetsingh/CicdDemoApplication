package com.cicd.com.java.com.cicd.com;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.cicd.com.Microservice4Controller;

@SpringBootTest
class Microservice4ControllerTest {
	@InjectMocks
	Microservice4Controller microservice4Controller;
	
	@Test
	public void test_method_When_Success() {
		
		String str = microservice4Controller.test_method();
		assertThat(str).isEqualTo("Hello World Test-Jenkins--test-pipeline");

	}
	@Test
	public void test_getTest_When_Success() {
		
		String str = microservice4Controller.getTest();
		assertThat(str).isEqualTo("Hello Test demo - Jenkins110-420-pipeline");

	}
}
