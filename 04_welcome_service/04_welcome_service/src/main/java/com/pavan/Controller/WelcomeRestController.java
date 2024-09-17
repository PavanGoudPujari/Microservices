package com.pavan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private Environment env;

	@GetMapping("/Welcome")
	public String getWelcomeMsg() {
		
		String port = env.getProperty("server.port");
		String str="Goodmorning pavan ("+ port +")";
		return str;
	}
}
