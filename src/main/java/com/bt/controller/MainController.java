package com.bt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping(value="/welcome")
	public String showHomePage() {
		return "home";
	}
}
