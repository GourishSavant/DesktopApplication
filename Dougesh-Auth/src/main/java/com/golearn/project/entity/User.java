package com.golearn.project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class User {

private String id;
private String name;
private String email;



public User() {
	
}



public User(String id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}



public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



}
