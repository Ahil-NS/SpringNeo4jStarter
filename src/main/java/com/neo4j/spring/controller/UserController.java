package com.neo4j.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
	
	@RequestMapping(value = "/createUser", method = RequestMethod.POST, produces = "application/json")
	public void createUser(@RequestParam String name) {
		System.out.println(name);
	
	}
	

}

