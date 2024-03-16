package com.golearn.project.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.golearn.project.entity.User;
import com.golearn.project.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getUser() {
		return userService.getUser();
	}
	@GetMapping("/current-user")
	public String getLoggedUser(Principal principal) {
		return principal.getName();
	}
}
