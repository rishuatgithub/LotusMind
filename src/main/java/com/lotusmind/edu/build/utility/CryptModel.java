package com.lotusmind.edu.build.utility;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class CryptModel {
	
	private String saltpass;
	
	public String generateSalt() {
		return BCrypt.gensalt(12);
	}
	
	public String generateCryptPass(String pswd, String saltpass) {
		return BCrypt.hashpw(pswd, saltpass);
	}
	
	public boolean decryptPass(String pswd, String db_passwrd) {
		return BCrypt.checkpw(pswd, db_passwrd);
	}


	public String getSaltpass() {
		return saltpass;
	}

	public void setSaltpass(String saltpass) {
		this.saltpass = saltpass;
	}
	
}
