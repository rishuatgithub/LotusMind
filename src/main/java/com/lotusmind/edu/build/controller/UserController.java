package com.lotusmind.edu.build.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lotusmind.edu.build.bean.LoginBean;
import com.lotusmind.edu.build.bean.UserSignupBean;
import com.lotusmind.edu.build.entity.Login;
import com.lotusmind.edu.build.entity.User;
import com.lotusmind.edu.build.repository.LoginRepository;
import com.lotusmind.edu.build.repository.UserRepository;
import com.lotusmind.edu.build.utility.CryptModel;
import com.lotusmind.edu.build.utility.IDGenerator;


@RestController
public class UserController {
	
	Login lg = new Login();
	User ur = new User();
	CryptModel cm = new CryptModel();
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Autowired
	private UserRepository userRepository;
		
	@RequestMapping(name="/user/signup", method=RequestMethod.POST)
	public @ResponseBody boolean addNewUser(@RequestBody UserSignupBean usb){
				
		if(loginRepository.userExists(usb.getEmail()) != 0) {
			return false;
		}
		
		String generated_userid=new IDGenerator().generateNewUserID();
		
		//set the User Details first
		ur.setUser_id(generated_userid);
		ur.setEmail(usb.getEmail());
		ur.setRole_id(usb.getRole_id());
		ur.setUser_fname(usb.getFname());
		ur.setUser_lname(usb.getLname());
		
		//Set the Login First
		lg.setUser_id(generated_userid);
		lg.setOrg_id(usb.getOrg_id());
		lg.setLogin_u_password_salt(cm.generateSalt());
		lg.setLogin_u_password(cm.generateCryptPass(usb.getUpasswd(), cm.generateSalt()));
		lg.setLogin_username(usb.getEmail());
		
		try {
			userRepository.save(ur);
			loginRepository.save(lg);
		}catch(Exception e){
			return false;
		}
		return true;
	}
	
	@RequestMapping(name="/user/login", method=RequestMethod.POST)
	public @ResponseBody boolean userLogin(@RequestBody LoginBean lb){
		
		
		
		boolean decrypt_pass = cm.decryptPass(lb.getPassword(), "tbc");
		
		return false;
		
	}
	
}
