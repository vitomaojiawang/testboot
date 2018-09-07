package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.User;
import com.example.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/queryUsers.do")
	public String queryUsers(Model model){
		List<User> users = userService.selectUsers();
		model.addAttribute("users", users);
		return "index";
	}
	
	@RequestMapping("/regStart.do")
	public String regStart(){
		return "reg";
	}
	
	@RequestMapping("/reg.do")
	public String reg(User user){
		userService.insertUsers(user);
		return "forward:queryUsers.do";
	}
	
}
