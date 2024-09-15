package com.pavan.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/Welcome")
	public String getWelcomeMsg() {
		String str="Goodmorning pavan";
		return str;
	}
}
