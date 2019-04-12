package com.web.springbootgittest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/ping")
	public ResponseEntity<String> ping()
	{
//		System.out.println("ping methhod!!!!!!!");
		System.out.println("ping called successfully!!!!!!!");
		return new ResponseEntity<String>("success", HttpStatus.OK);
		
	}

}
