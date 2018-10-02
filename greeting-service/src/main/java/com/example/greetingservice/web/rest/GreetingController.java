package com.example.greetingservice.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.greetingservice.service.GreetingService;
import com.example.greetingservice.service.dto.Greeting;

@RestController
public class GreetingController {

	@Autowired
	private GreetingService service;

	@GetMapping("/greeting")
	public Greeting greeting() {
		return service.getSreeting();
	}

}
