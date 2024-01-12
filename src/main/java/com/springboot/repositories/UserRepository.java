package com.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value="select * from user where username= :username LIMIT 1",nativeQuery=true)
	public User findbyusername(String username);
	//public User findbypassword(String password);
}
