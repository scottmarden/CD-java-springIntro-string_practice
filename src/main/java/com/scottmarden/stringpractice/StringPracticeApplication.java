package com.scottmarden.stringpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringPracticeApplication.class, args);
	}
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to my website, it's made possible by users like you!";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "There is nothing as random as something not random";
	}
}
