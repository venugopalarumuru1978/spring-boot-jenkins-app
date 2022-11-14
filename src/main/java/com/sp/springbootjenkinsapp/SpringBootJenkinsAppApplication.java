package com.sp.springbootjenkinsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsAppApplication.class, args);
		System.out.println("Docker App Started...");
	}
}
