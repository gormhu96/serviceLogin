package com.login.ws.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.login.ws.rest.model.User;
import com.login.ws.rest.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository repository;

	@Override
	public List<User> getAll() {
		return repository.findAll();
	}

	@Override
	public boolean logueando(User user) {
		User objUser = repository.findByUser(user.getUser());
		if(objUser != null) 
		{
			if(objUser.getPassword().equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}
	
	

}
