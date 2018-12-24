package com.login.ws.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.login.ws.rest.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query("select u from User u where u.user=:user")
	public User findByUser(@Param("user") String user);

}
