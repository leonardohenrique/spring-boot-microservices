package com.example.greetingservice.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.greetingservice.service.dto.Greeting;

@Service
public class GreetingService {

	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private Environment env;

	public Greeting getSreeting() {
		Greeting greeting = new Greeting();
		greeting.setId(counter.incrementAndGet());
		greeting.setContent("Hello from EurekaClient!");
		greeting.setServerPort(Integer.valueOf(env.getProperty("local.server.port")));
		return greeting;
	}

}
