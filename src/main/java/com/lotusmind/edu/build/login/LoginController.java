package com.lotusmind.edu.build.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@Autowired
	private LoginRepository loginRepository;
	
	@RequestMapping(method=RequestMethod.POST, path="/login")
	public String login(@RequestParam(value="name", defaultValue="User") String username, 
			@RequestParam(value="pwd", defaultValue="Password") String password) {

		int logincount = loginRepository.getLoginCount(username, password);
		
		if(logincount!=1) {
			return "LOGIN FAILED";
		}
		return "LOGIN SUCCESS";
	}

}
