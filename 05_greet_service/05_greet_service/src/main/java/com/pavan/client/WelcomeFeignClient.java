package com.pavan.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOME-SERVICE")
public interface WelcomeFeignClient {
	
	@GetMapping("/Welcome")
	public String getWelcomeMsg();

}
