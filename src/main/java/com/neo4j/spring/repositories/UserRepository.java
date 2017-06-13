package com.neo4j.spring.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;

import com.neo4j.spring.domain.User;

public interface UserRepository extends GraphRepository<User> {

	@Query("create (u:Node{id:{name}})")
	public String createUser(@Param("name") String name);
	
	@Query("MATCH (n) DETACH DELETE n")
	public String deleteAllUser(@Param("name") String name);
	
	
	
}


