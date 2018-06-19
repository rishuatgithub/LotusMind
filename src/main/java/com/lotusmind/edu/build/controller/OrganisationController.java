package com.lotusmind.edu.build.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lotusmind.edu.build.entity.Organisation;
import com.lotusmind.edu.build.repository.OrganisationRepository;

@RestController
@RequestMapping(path="/org")
public class OrganisationController {
	
	@Autowired
	private OrganisationRepository orgrepo;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public @ResponseBody Iterable<Organisation> getAllOrgs(){		
		return orgrepo.findAll();
	}
	

}
