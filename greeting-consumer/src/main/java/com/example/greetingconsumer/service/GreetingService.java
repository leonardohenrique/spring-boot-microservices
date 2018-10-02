package com.example.greetingconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.greetingconsumer.service.client.GreetingClient;
import com.example.greetingconsumer.service.dto.Greeting;

@Service
public class GreetingService {

	@Autowired
	private GreetingClient greetingClient;

	@Autowired
	private Environment env;

	public Greeting getGreeting() {
		Greeting greeting = greetingClient.getGreeting();
		greeting.setClientPort(Integer.valueOf(env.getProperty("local.server.port")));
		return greeting;
	}

}
