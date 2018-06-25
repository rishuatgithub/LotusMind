package com.lotusmind.edu.build.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lotusmind.edu.build.bean.LoginBean;
import com.lotusmind.edu.build.entity.Login;
import com.lotusmind.edu.build.repository.LoginRepository;
import com.lotusmind.edu.build.utility.CryptModel;

@RestController
@RequestMapping(path="/login")
public class LoginController {
	
	Login lg = new Login();
	CryptModel cm = new CryptModel();
	
	@Autowired
	private LoginRepository loginRepository;
	
	@RequestMapping(value="/signin", method=RequestMethod.POST)
	public @ResponseBody String userLogin(@RequestBody LoginBean lb){
		
		String db_pass=null;
		try{
			db_pass = loginRepository.findUser(lb.getOrg_id(), lb.getUserid());
			
			if(cm.decryptPass(lb.getPassword(), db_pass)) {
				return "Login Success";
			}
		}catch(Exception e) {
			return "User Account cannot be Found. Please recheck your credentials.";
		}
		
		return "Login Failed";
		
	}

}
