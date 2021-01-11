package com.bt.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bt.service.ILocaleService;

@Controller
public class MainController {
	@Autowired
	private ILocaleService service;
	
	@GetMapping(value="/welcome")
	public String showHomePage() {
		return "home";
	}
	
	@GetMapping(value="/countries")
	public String fetchAllCountries(Model model) {
		Set<String> countriesList=null;
		
		countriesList=service.fetchCountriesList();
		model.addAttribute("listInfo", countriesList);
		model.addAttribute("operation", "COUNTRIES");
		model.addAttribute("countriesCount", countriesList.size());
		return "show_results";
		
	}
}
