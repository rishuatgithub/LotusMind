package com.lotusmind.edu.build.utility;

import java.util.UUID;

public class IDGenerator {

	public String generateNewUserID() {
		return UUID.randomUUID().toString();
	}
}
