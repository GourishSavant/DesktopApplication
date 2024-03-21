package com.blogApplication.project.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogApplication.project.Dto.UserDto;
import com.blogApplication.project.Repository.UserRepository;
import com.blogApplication.project.entity.User;
import com.blogApplication.project.exception.ResourceNotFoundException;
import com.blogApplication.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto addUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user = this.DtoToUser(userDto);
		User SavedUser=  this.userRepository.save(user);
		 return this.userToDto(SavedUser);
	}

	@Override
	public UserDto update(UserDto userDto, Integer userId) {
		// TODO Auto-generated method stubjn
		User user =userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","Id",userId));
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
	    User Updateduser =	this.userRepository.save(user);
		return userToDto(Updateduser);
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
	User user =	this.userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User Not Found","id",userId));
	return userToDto(user);
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> users =this.userRepository.findAll();
		List<UserDto> userDto =  users.stream().map(user -> this.userToDto(user)).collect(Collectors.toList());
		return userDto;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub
	 User user =this.userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("not found ","id",userId));
	 	this.userRepository.delete(user);
	}
	
	private User DtoToUser(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		return user;
	}
	
	public UserDto userToDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setAbout(user.getAbout());
		return userDto;
	}
	
	
}
