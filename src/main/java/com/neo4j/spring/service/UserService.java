package com.neo4j.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neo4j.spring.domain.User;
import com.neo4j.spring.repositories.UserRepository;
import com.neo4j.spring.response.UserResponse;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String createNode(String name, String country) {

		return userRepository.createUser(name, country);
	}

	public String deleteAllUser(String name) {

		return userRepository.deleteAllUser(name);
	}

	public String updateUser(String name, String newname) {

		return userRepository.updateUser(name, newname);
	}

	@Transactional
	public UserResponse getUserCountry(String name) {
		UserResponse response = new UserResponse();
		User userName = userRepository.getUser(name);
		response.setName(userName.getName());
		response.setCountry(userName.getCountry());
		return response;
	}

	public String createRelationship(String name, String lovername) {

		return userRepository.createRelationship(name, lovername);
	}

}
