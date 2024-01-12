package com.springboot.services;

import java.util.List;

import com.springboot.entities.User;

public interface UserService {

	public User saveUser(User user);
	public User updateUser(User user);
	public void delteUser(User user);
	public User findbyid(long id);
	public List<User> finAll();
	public User findbyusername(String username);
}
