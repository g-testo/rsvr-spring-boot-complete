package com.tts.rsvrInClass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.rsvrInClass.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceInt {
	
	@Autowired
	private UserRepository userRepository;
	
	// Get all Users
	// Get User by id
	// Create a User
	// Update User
	// Delete a User
	
}
