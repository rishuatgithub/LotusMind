package com.lotusmind.edu.build.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.lotusmind.edu.build.entity.Organisation;

public interface OrganisationRepository extends CrudRepository<Organisation, String> {

	@Query("SELECT org_name,org_display_name,address_l1,address_l2,city,county,state,country,postal_code,mobile,social_id "
			+ "FROM organisation where org_id=:org_id")
	public Iterable<Organisation> findDeptdetailByID(@Param("org_id") int org_id);
}