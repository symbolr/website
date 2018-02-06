package com.symbol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/index")
	public ModelAndView index(ModelAndView mv) {
	    mv.setViewName("/index");
	    return mv;
	}
	@RequestMapping(value = "/home")
	public ModelAndView home(ModelAndView mv) {
	    mv.setViewName("/home");
	    return mv;
	}
	@RequestMapping(value = "/Products_List")
	public ModelAndView Products_List(ModelAndView mv) {
	    mv.setViewName("/Products_List");
	    return mv;
	}
}
