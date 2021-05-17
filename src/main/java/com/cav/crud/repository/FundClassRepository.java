package com.cav.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cav.onetomany.eager.enties.FundClass;

@Repository
public interface FundClassRepository extends CrudRepository <FundClass, Long>{

}
