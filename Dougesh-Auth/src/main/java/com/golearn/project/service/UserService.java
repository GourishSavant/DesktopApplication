package com.golearn.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.golearn.project.entity.User;
@Service
public class UserService {
  
	private List<User> store = new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"gourish","gourish@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"naveen","naveen@gmail.com"));
	}
	public List<User> getUser(){
		return this.store;
	}
}
