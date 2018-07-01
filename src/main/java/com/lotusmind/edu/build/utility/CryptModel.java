package com.lotusmind.edu.build.utility;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
public class CryptModel {
	
	public String generateCryptPass(String pswd) {
		
		BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
		return bcryptPasswordEncoder.encode(pswd);
	}

	public boolean decryptPass(String pswd, String db_passwrd) {
		return new BCryptPasswordEncoder().matches(pswd, db_passwrd);
	}
}
