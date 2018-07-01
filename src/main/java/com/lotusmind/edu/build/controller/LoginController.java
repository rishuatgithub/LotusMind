package com.lotusmind.edu.build.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lotusmind.edu.build.bean.LoginBean;
import com.lotusmind.edu.build.bean.ReturnBean;
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
	public @ResponseBody ResponseEntity<ReturnBean> userLogin(@RequestBody LoginBean lb){
		
		//String db_pass=null;
		List<Login> result = null;
		ReturnBean rb = new ReturnBean();
		try{
			result = loginRepository.findUserByLogin(lb.getOrg_id(), lb.getUserid());	
			
			if(!cm.decryptPass(lb.getPasswd(), result.get(0).getLogin_u_password())) {
				
				rb.setResponse_result("Not Matched");
				rb.setResponse_status("NOT_FOUND");
				return new ResponseEntity<>(rb,HttpStatus.NOT_FOUND);
			}
		}catch(Exception e) {
			
			rb.setResponse_result("Errors Found");
			rb.setResponse_status("NOT_FOUND");
			return new ResponseEntity<>(rb,HttpStatus.NOT_FOUND);
		}
		
		rb.setResponse_result(result.get(0).getUser_id());
		rb.setResponse_status("OK");
		return new ResponseEntity<>(rb,HttpStatus.OK);
		
	}

}
