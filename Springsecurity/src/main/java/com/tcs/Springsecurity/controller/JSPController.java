package com.tcs.Springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSPController {
	
	
	
	@RequestMapping("/sam")
	public String getJSPPage() {
		return "sample";
	}
	@RequestMapping("/login")
	public String getPage() {
		return "login";
	}
	
	@RequestMapping("/wel")
	public String getWelcome() {
		return "welcome";
	}
}
