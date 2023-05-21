package com.pjt.goodminton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.pjt.goodminton")
public class GoodmintonApplication {
	public static void main(String[] args) {
		SpringApplication.run(GoodmintonApplication.class, args);
	}
}
