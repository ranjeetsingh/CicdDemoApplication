package com.cicd.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CicdDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CicdDemoApplication.class, args);
	}
}
	@RestController
	//@RequestMapping("/mywebapp")
	class Microservice4Controller {

		@Autowired
		RestTemplate restTemplate;
		
		@Bean
		public RestTemplate getRestTemplate() {
			return new RestTemplate();
		}

		@GetMapping(value = "/getTest")
		public String test_method() {
			return "Hello World Test-Jenkins";
		}
		@GetMapping(value = "/")
		public String getTest() {
			
			return "Hello Test demo - Jenkins110";
		}
		
}
