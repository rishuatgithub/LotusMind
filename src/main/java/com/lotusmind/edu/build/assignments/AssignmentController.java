package com.lotusmind.edu.build.assignments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/assignment")
public class AssignmentController {

	@Autowired
	private AssignmentRepository assignmentRepository;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public @ResponseBody Iterable<Assignment> getAllAssignments(@RequestParam int org_id){
		return assignmentRepository.findAllAssignments(org_id);
	}
	
}
