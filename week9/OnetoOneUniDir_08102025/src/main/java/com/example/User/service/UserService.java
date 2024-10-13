package com.example.User.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.example.User.model.Profile;
import com.example.User.model.User;
import com.example.User.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	
	public User createUser(User user) {
	//	Profile prof = user.getProfile();
	//	prof.setUser(user);
		return uRepo.save(user);
	}
	
	public User getUser(long userid) {
		User user=null;
		Optional<User> ouser = uRepo.findById(userid);
		if(ouser.isPresent()) {
			user=ouser.get();
		}
		return user;
	}
}
