package com.srinjoy.login;

import org.springframework.stereotype.Service;

//new LoginService()
@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Srinjoy") && password.equals("demo");
	}

}