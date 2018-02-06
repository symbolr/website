package com.symbol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value = "/user")
	public ModelAndView user(ModelAndView mv) {
	    mv.setViewName("/user");
	    mv.addObject("title","欢迎使用Thymeleaf!");
	    return mv;
	}

}
