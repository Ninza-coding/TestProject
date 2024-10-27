package com.taxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping(path= {"","/","home","index","welcome"})
	public String welcomeView() {
		return "index";
	}
}
