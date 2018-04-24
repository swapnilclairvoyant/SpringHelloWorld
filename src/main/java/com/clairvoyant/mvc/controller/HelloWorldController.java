package com.clairvoyant.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/helloworld")
	public ModelAndView helloworld(ModelMap model) {
		//String message = ;
		//model.addAttribute("messages", "Hello World !!!");
		return new ModelAndView("welcome","messages", "Hello World !!!");
	}
}
