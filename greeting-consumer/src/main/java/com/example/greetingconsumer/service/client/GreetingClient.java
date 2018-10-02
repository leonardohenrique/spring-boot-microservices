package com.example.greetingconsumer.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.greetingconsumer.service.dto.Greeting;

@FeignClient("greeting-services")
public interface GreetingClient {

	@GetMapping("/greeting")
	Greeting getGreeting();
}
