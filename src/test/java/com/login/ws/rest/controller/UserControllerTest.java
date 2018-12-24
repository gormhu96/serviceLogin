package com.login.ws.rest.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.login.ws.rest.model.User;
import com.login.ws.rest.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserControllerTest {

	@Mock
	private UserService service;
	
	@InjectMocks
	private UserController controller;
	
	@Test
	public void loginTest() {
		
		User user = new User();
		user.setPassword("");
		user.setUser("");
		
		when(service.logueando(user)).thenReturn(true);
		
		String response = controller.login(user);
		
		assertEquals("Usuario logueado", response);	
		
	}
	
}
