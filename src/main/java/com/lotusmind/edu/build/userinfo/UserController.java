package com.lotusmind.edu.build.userinfo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value="/details")
	public @ResponseBody Iterable<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping(value="/add")
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam int age) {
				
		User u=new User();
		
		u.setUser_name(name);
		u.setUser_age(age);
		
		userRepository.save(u);
		return "User Added";
	}

}
