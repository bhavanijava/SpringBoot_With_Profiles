package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.UserTab;
import com.web.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	

	

	@GetMapping("/findAll")
	public List<UserTab> findAllUsers()
	{
		return service.getUser();
	}
}