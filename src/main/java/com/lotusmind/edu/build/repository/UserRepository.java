package com.lotusmind.edu.build.repository;

import org.springframework.data.repository.CrudRepository;

import com.lotusmind.edu.build.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
