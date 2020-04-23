package com.tts.rsvrInClass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.rsvrInClass.service.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	// Get all Users
	// Get User by id
	// Create a User
	// Update User
	// Delete a User

}
