package com.example.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ValueObject.User;
import com.example.demo.service.ServiceLayer;

@RestController
public class HomeController {
	
	private final ServiceLayer serviceLayer;
	
	
	public HomeController (ServiceLayer serviceLayer)
	{
		this.serviceLayer=serviceLayer;
	}
	
	
	@GetMapping("/")
	public ResponseEntity<User> getData()
	{
		return new ResponseEntity<>(serviceLayer.consumeAPI(),HttpStatus.OK) ;
	}

}
