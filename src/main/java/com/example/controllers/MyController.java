package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	  @GetMapping("/api/data")
	    public String getData() {
	        return "Hello from GET endpoint!";
	    }

	    @PostMapping("/api/data")
	    public String addData(@RequestBody String data) {
	        
	        return "Data added: " + data;
	    }

}
