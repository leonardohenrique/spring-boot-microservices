package com.example.greetingconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("greeting-services")
public interface GreetingClient {
	
    @RequestMapping("/greeting")
    String getGreeting();
}

