package com.pavan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.client.WelcomeFeignClient;

@RestController
public class GreetRestController {

	@Autowired
	private WelcomeFeignClient welcomeClient;

		@GetMapping("/greet")
		public String getString() {
			
			String welcomeMsg= welcomeClient.getWelcomeMsg();
			String str="greet pavan";
			return str+welcomeMsg;
		}
	
}
