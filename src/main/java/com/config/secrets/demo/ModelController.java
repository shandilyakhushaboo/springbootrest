package com.config.secrets.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {
	@Autowired  
	
	@GetMapping(value = "/")  
	public String getModel()   
	{  
	  
	return "Reading from env variable JAVA_HOME: " + System.getenv("JAVA_HOME");  
	}
}
