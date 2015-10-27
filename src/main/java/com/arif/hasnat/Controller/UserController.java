package com.arif.hasnat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arif.hasnat.service.UserService;


@Controller
public class UserController {

	@Autowired
	public UserService userService;
	
    
	

	@RequestMapping("/users")
	public String users(Model model){
		model.addAttribute("users",userService.findAll());
		
		return "users";
		
		
		
	}
	
	@RequestMapping("/users/{id}")
	public String details(Model model,@PathVariable Long id){
		model.addAttribute("user",userService.findOne(id));
		
		return "users-details";
		
	}
	
	
}
