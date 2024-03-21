package com.blogApplication.project.service;

import java.util.List;

import com.blogApplication.project.Dto.UserDto;

public interface UserService {

	public UserDto addUser(UserDto userDto);
	
	public UserDto update(UserDto userDto, Integer userId);
	
	public UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);
	
	
	
	
}
