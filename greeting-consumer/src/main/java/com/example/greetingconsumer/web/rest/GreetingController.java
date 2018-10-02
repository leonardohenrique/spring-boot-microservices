package com.example.greetingconsumer.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.greetingconsumer.service.GreetingService;
import com.example.greetingconsumer.service.dto.Greeting;

@RestController
public class GreetingController {

	@Autowired
	private GreetingService greetingService;

	@RequestMapping("/greeting")
	public Greeting greeting() {
		return greetingService.getGreeting();
	}
}
