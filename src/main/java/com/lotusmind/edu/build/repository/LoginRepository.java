package com.lotusmind.edu.build.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.lotusmind.edu.build.entity.Login;

public interface LoginRepository extends CrudRepository<Login, String> {

	@Query("SELECT count(user_id) FROM login where login_username=:username")
	public int userExists(@Param("username") String username);
		
	@Query("SELECT lo FROM login lo where org_id=:orgid and login_username=:username")
	List<Login> findUserByLogin(@Param("orgid")int orgid, @Param("username") String username);
	
}
