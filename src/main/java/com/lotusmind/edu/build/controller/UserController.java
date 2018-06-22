package com.lotusmind.edu.build.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lotusmind.edu.build.entity.Login;
import com.lotusmind.edu.build.entity.User;
import com.lotusmind.edu.build.model.CryptModel;
import com.lotusmind.edu.build.model.IDGenerator;
import com.lotusmind.edu.build.repository.LoginRepository;
import com.lotusmind.edu.build.repository.UserRepository;


@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Autowired
	private UserRepository userRepository;
		
	@RequestMapping(name="/signup", method=RequestMethod.POST)
	public boolean addNewUser(
			@RequestBody int org_id,
			@RequestBody String fname,
			@RequestBody String lname,
			@RequestBody String email,
			@RequestBody int role_id,
			@RequestBody String upasswd
			){
		
		
		if(loginRepository.userExists(email) == 0) {
			return false;
		}
		
		Login lg = new Login();
		User ur = new User();
		CryptModel cm = new CryptModel();
				
		lg.setUser_id(new IDGenerator().generateNewUserID());
		lg.setOrg_id(org_id);
		lg.setLogin_u_password_salt(cm.generateSalt());
		lg.setLogin_u_password(cm.generateCryptPass(upasswd, cm.generateSalt()));
		lg.setLogin_username(email);
		
		ur.setEmail(email);
		ur.setRole_id(role_id);
		ur.setUser_fname(fname);
		ur.setUser_lname(lname);
		
		try {
			loginRepository.save(lg);
			userRepository.save(ur);
		}catch(Exception e){
			return false;
		}
		return true;
	}
}
