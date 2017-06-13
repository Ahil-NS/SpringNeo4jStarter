package com.neo4j.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neo4j.spring.repositories.UserRepository;
import com.neo4j.spring.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/createUser", method = RequestMethod.POST, produces = "application/json")
	public String createUser(@RequestParam String name) {
		return userService.createNode(name);
	}

	@RequestMapping(value = "/deleteAllUser", method = RequestMethod.POST, produces = "application/json")
	public String deleteUser(@RequestParam String name) {
		return userService.deleteAllUser(name);
	}
}
