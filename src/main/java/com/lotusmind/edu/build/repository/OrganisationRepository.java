package com.lotusmind.edu.build.repository;

import org.springframework.data.repository.CrudRepository;

import com.lotusmind.edu.build.entity.Organisation;

public interface OrganisationRepository extends CrudRepository<Organisation, String> {

}
