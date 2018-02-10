package com.symbol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.symbol.mapper.UserMapper;
import com.symbol.model.UserInfo;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserMapper dao;
	
	@RequestMapping(value = "/user")
	public ModelAndView user(ModelAndView mv) {
	    mv.setViewName("/user");
	    List<UserInfo> list = dao.getAll();
	    for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	    mv.addObject("user",list);
	    mv.addObject("title","欢迎使用Thymeleaf!");
	    return mv;
	}

}
