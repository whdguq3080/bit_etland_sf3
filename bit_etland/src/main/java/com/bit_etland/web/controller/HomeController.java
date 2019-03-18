package com.bit_etland.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bit_etland.web.proxy.ContextProxy;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes({"ctx","css","js","img","time"})
public class HomeController{
	static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired ContextProxy pxy;
	
	@RequestMapping("/")
	public String home(HttpSession session,
			HttpServletRequest request){
		logger.info("\n --------- Welcome {} !! ----------","Home");
		pxy.setContext();
		return "algorithm.jsp";
	}
	@RequestMapping("/move/{dir}/{page}") //URL을 뜻한다
	public String move(@PathVariable String dir,
				       @PathVariable String page) {
		logger.info("\n --------- move to {} !! ----------",dir +"/"+page);
		
		return String.format("public:%s/%s.tiles",dir,page);
	}
}