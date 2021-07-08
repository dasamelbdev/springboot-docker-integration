package com.training.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class HelloController {

	@Autowired
	private RestTemplate restTemplate;
	

	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {
		
		//String serviceUrl="http://name:8085/api/name";
		String serviceUrl="http://localhost:8085/api/name";//k8 way. within pod can us localhost to communicate between containers
		
		ResponseEntity<String> response = restTemplate.getForEntity(serviceUrl, String.class);
		String name=response.getBody();

		return new ResponseEntity<String>("hi " + name, HttpStatus.OK);
	}
}
