package com.neo4j.spring.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;

import com.neo4j.spring.domain.User;

public interface UserRepository extends GraphRepository<User> {

	//@Query("create (User{name:{name},country:{country}})")
	@Query("create (u:User{name:{name},country:{country}})")
	public String createUser(@Param("name") String name, @Param("country") String country);

	@Query("MATCH (n) DETACH DELETE n")
	public String deleteAllUser(@Param("name") String name);

	@Query("MATCH (u:User) WHERE u.name= {name} SET u.name={newname}")
	public String updateUser(@Param("name") String name, @Param("newname") String newname);

	//@Query("MATCH(u) RETURN u")
	@Query("MATCH (u:User) WHERE u.name= {name} RETURN u")
	public User getUser(@Param("name") String name);
	
	@Query("CREATE (le:Person {name:{name}}),(db:Person {name:{lovername}}),(le)-[:LOVES]->(db)RETURN le, db")
	public String createRelationship(@Param("name") String name,@Param("lovername") String lovername);
	
	
	
	

}
