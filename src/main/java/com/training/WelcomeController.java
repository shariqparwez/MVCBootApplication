package com.training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("/")
	public String init(){
		return "index";
	}
}
