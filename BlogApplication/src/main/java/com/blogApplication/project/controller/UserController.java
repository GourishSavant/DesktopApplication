package com.blogApplication.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogApplication.project.Dto.UserDto;
import com.blogApplication.project.response.Response;
import com.blogApplication.project.service.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto){
		UserDto SaveduserDto =this.userService.addUser(userDto);
		return new ResponseEntity<>(SaveduserDto, HttpStatus.CREATED);
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto,@PathVariable("userId") Integer UserId){
		UserDto updatedUser =this.userService.update(userDto, UserId);
		return new ResponseEntity<>(updatedUser,HttpStatus.OK);
//		or ResponseEntity.ok(updatedUser);
	}
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getByUserId(@PathVariable("userId") Integer UserId){
		UserDto userDto =this.userService.getUserById(UserId);
		return new ResponseEntity<>(userDto , HttpStatus.OK);
	}
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUser(UserDto userDto){
	List<UserDto> AllUsers =this.userService.getAllUsers();
	return ResponseEntity.ok(AllUsers);	
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<Response> DeleteUser(@PathVariable("userId") Integer userId){
		this.userService.deleteUser(userId);
		return new ResponseEntity<>(new Response("user deleted Successfully", true ),HttpStatus.OK);
	}
}
