package com.example.greetingconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Autowired
	private GreetingConsumer greetingConsumer;
	
    @Autowired
    private GreetingClient greetingClient;	

	@RequestMapping("/greeting")
	public String greeting() {
		return greetingClient.getGreeting();
	}
}
