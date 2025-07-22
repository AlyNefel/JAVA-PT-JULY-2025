package com.firstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
		
	}
	
@RequestMapping("/app")
	
	//building up the method that will be executed with when this route is triggered through the browser
	public String index() {
		return "<h1>Hello !! from Rest Controller1111 </h1>";
	}

}
