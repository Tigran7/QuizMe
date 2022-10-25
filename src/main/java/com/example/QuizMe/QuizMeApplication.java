package com.example.QuizMe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class QuizMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizMeApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello World";
	}

}
