package com.example.User.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.User.model.User;
import com.example.User.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService uService;
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return uService.createUser(user);
	}
	
	@GetMapping("/{userid}")
	public User getUser(@PathVariable long userid) {
		return uService.getUser(userid);
	}
}
