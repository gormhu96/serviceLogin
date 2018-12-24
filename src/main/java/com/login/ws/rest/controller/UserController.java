package com.login.ws.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.ws.rest.model.User;
import com.login.ws.rest.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	@Qualifier("userService")
	private UserService service;
	
	@GetMapping("/get/all")
	public List<User> lista() {
		return service.getAll();
	}
	
	@PostMapping("/post/login")
	public String login(@RequestBody User user)
	{
		boolean loguea = service.logueando(user);
		if(loguea==true)
		{
			return "Usuario logueado";
		}
		return "Usuario o contraseña errado";
	}
	
	
}
