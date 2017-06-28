package com.spring.cloud.securedui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.securedui.domain.UserResponse;

@RestController
public class SpringRestController {
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public UserResponse getUser(@RequestParam String name, @RequestParam String email, @RequestParam String password){
		UserResponse userResponse = new UserResponse();
		userResponse.setName(name);
		userResponse.setEmail(email);
		userResponse.setPassword(password);
		
		System.out.println(userResponse);
		
		return userResponse;
	}
}
