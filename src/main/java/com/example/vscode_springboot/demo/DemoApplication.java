package com.example.vscode_springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// Getリクエストがルートパスに来たときのController
	@GetMapping("/")
	public String helloWorld() {
		return "index"; // src/main/resources/templates/index.html をレンダリングして返す
	}

}
