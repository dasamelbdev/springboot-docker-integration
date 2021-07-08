package com.training.name.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NameController {
	
	@Value("${name}")
	private String userName;

	@GetMapping("/name")
	public ResponseEntity<String> sendName() {

		return new ResponseEntity<String>(userName, HttpStatus.OK);
	}

}
