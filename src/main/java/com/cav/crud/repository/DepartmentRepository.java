package com.cav.crud.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cav.onetomany.bidirectional.eager.entities.Department;
import com.cav.onetomany.bidirectional.eager.entities.Person;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
	

}
