package com.javatechie.jwt.api.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	public String welcome() {
		return "Welcome to java jwt security!!!";
	}

}
