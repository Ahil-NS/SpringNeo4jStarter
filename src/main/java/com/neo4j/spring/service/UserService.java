package com.neo4j.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo4j.spring.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String createNode(String name) {

		return userRepository.createUser(name);
	}
	
	public String deleteAllUser(String name) {

		return userRepository.deleteAllUser(name);
	}


}
