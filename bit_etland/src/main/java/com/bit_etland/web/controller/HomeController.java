package com.bit_etland.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController{
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String home(Model model){
		System.out.println("진입");
		model.addAttribute("serverTime",new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		return "home";
	}
}