package com.lotusmind.edu.build.assignments;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AssignmentRepository extends CrudRepository<Assignment, String>{
	
	@Query("SELECT assignment_name, display_name,due_date FROM mst_assignment WHERE org_id=:org_id")
	public List<Assignment> findAllAssignments(@Param("org_id") int org_id);

}
