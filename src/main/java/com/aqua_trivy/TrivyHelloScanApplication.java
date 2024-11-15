package com.aqua_trivy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TrivyHelloScanApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrivyHelloScanApplication.class, args);
	}

}

@RestController
class HelloWorldController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!, India";
	}
}