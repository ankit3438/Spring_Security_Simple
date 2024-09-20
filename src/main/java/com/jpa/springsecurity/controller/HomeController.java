package com.jpa.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jpa.springsecurity.entity.UserDtls;
import com.jpa.springsecurity.service.UserServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@Autowired
	public UserServiceImpl s;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/signin")
	public String login() {
		return "login";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	@PostMapping("/createuser")
	public String createuser(@ModelAttribute UserDtls u,HttpSession session) {
		if(s.checkEmail(u.getEmail())) {
			session.setAttribute("msg", "email already exists");
		}
		else {
			UserDtls temp=s.createUser(u);
			if(temp==null)session.setAttribute("msg", "not saved succesfully");
			else session.setAttribute("msg", "saved succesfully");
		}
		return "redirect:/register";
	}
}
