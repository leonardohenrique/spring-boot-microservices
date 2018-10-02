package com.example.greetingconsumer.service.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.greetingconsumer.service.EurekaService;

@Component
public class GreetingConsumer {

	private static final String SERVICE_ID = "greeting-services";

	private static final String GREETING_ENDPOINT = "/greeting";

	@Autowired
	private EurekaService eurekaService;

	public String getGreeting() {
		RestTemplate restTemplate = new RestTemplate();
		URI uri = eurekaService.getInstance(SERVICE_ID);
		String greeting = restTemplate.getForObject(uri.toString() + GREETING_ENDPOINT, String.class);
		return greeting;
	}

}
