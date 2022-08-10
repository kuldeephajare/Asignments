package com.example.demo.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.ValueObject.User;

@Service
public class ServiceLayer {
	
	
	private final RestTemplate restTemplate;
	
	   
	public ServiceLayer(RestTemplate restTemplate)
	{
		this.restTemplate=restTemplate;
	}
	
	   
	public User consumeAPI()
	{
		return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1",User.class);
	}

} 
