package com.tcs.Springsecurity.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password4j.BcryptPassword4jPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@GetMapping("/msg")
	public String getHello() {
		System.out.println("Called");
		return "welcome to page";
	}
	
	public static void main(String[] args) {
		PasswordEncoder p = new BcryptPassword4jPasswordEncoder();
		String pass = "xyz";
		String enc = p.encode(pass);
		System.out.println(enc);
		
	}

}
