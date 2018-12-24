package com.login.ws.rest.service;

import java.util.List;

import com.login.ws.rest.model.User;

public interface UserService {

	public List<User> getAll();

	public boolean logueando(User user);

}
