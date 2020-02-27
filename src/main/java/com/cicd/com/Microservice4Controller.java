package com.cicd.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Microservice4Controller {

	@GetMapping(value = "/getTest")
	public String test_method() {
		return "Hello World Test-Jenkins--test-pipeline";
	}

	@GetMapping(value = "/")
	public String getTest() {

		return "Hello Test demo - Jenkins110-420-pipeline";
	}
}
