package com.cav;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cav.entities.Fund;



@Repository
public interface FundRepository extends CrudRepository <Fund, Long>{

}
