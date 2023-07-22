package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class mycontroller2 {

	@Autowired
	private RestTemplate restTemplate ;
	
	@GetMapping("/api/message")
	public String getMessageFromMs1() {
		final String message = restTemplate.getForObject("http://localhost:8081/api/ms1", String.class);
	return message  ;
	
	
	}
	
	
}
