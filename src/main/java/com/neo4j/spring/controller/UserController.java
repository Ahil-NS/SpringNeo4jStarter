package com.neo4j.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neo4j.spring.repositories.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/createUser", method = RequestMethod.POST, produces = "application/json")
	public String createUser(@RequestParam String name) {
		return userRepository.createUser(name);
	}

	@RequestMapping(value = "/deleteAllUser", method = RequestMethod.POST, produces = "application/json")
	public String deleteUser(@RequestParam String name) {
		return userRepository.deleteAllUser(name);
	}
}
