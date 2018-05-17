package com.lotusmind.edu.build.login;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface LoginRepository extends CrudRepository<Login, String> {

	@Query("SELECT COUNT(DISTINCT username) FROM login where username=:username and password=:password")
	public int getLoginCount(@Param("username") String username, @Param("password") String password);
	
	@Query("INSERT INTO login VALUES(':username',':password')")
	public boolean addNewUser(@Param("username") String username, @Param("password") String password);
}
