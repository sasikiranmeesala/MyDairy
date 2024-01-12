package com.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.User;
import com.springboot.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delteUser(User user) {
		userRepository.delete(user);
	}

	@Override
	public User findbyid(long id) {
		return userRepository.findById(id).get() ;
	}

	@Override
	public List<User> finAll() {
		return userRepository.findAll();
	}

	@Override
	public User findbyusername(String username) {
		return userRepository.findbyusername(username);
	}

}
