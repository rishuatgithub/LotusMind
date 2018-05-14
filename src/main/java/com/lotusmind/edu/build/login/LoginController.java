package com.lotusmind.edu.build.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping("/login")
	public Login login(@RequestParam(value="name", defaultValue="User") String username, 
			@RequestParam(value="pwd", defaultValue="Password") String password) {

		return new Login(username,password);
	}

}
