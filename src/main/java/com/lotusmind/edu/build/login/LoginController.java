package com.lotusmind.edu.build.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/login")
public class LoginController {

	@Autowired
	private LoginRepository loginRepository;

	@RequestMapping(method=RequestMethod.POST, path="/signin")
	public String login(@RequestParam(value="name", defaultValue="User") String username, 
			@RequestParam(value="pwd", defaultValue="Password") String password) {

		int logincount = loginRepository.getLoginCount(username, password);

		if(logincount!=1) {
			return "LOGIN FAILED";
		}
		return "LOGIN SUCCESS";
	}

	@RequestMapping("/newuser")
	public @ResponseBody String newuser(@RequestParam(value="username") String username, 
			@RequestParam(value="pwd") String pass){
		
		boolean newuser_stat = loginRepository.addNewUser(username, pass);
		
		if(!newuser_stat) {
			return "FAIL";
		}
		return "ADDED";
	}

}
