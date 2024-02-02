package com.example.JenkinsPipelineTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsPipelineTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPipelineTestApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String abc() {
		return "hello Kunal";
	}

	
}
