package com.Suresh.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControl {

	@GetMapping("/")
	public String get() {
		return "welcome buddy for learning OAuth2 using Github account...";
	}
}
