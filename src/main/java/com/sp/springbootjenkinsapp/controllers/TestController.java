package com.sp.springbootjenkinsapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class TestController {

	@GetMapping("/show")
	public String ShowInfo()
	{
		return "hello docker";
	}
	
	@GetMapping("/welcome")
	public String GetInfo()
	{
		return "Hello jenkins";
	}
}
