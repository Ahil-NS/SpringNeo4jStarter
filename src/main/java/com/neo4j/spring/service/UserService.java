package com.neo4j.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo4j.spring.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String createNode(String name,String country) {

		return userRepository.createUser(name,country);
	}
	
	public String deleteAllUser(String name) {

		return userRepository.deleteAllUser(name);
	}
	
	public String updateUser(String name,String newname) {

		return userRepository.updateUser(name, newname);
	}


}
