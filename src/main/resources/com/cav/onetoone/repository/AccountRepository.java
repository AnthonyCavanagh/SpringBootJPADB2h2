package com.cav.onetoone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cav.entities.Fund;
import com.cav.onetoone.eager.entities.Account;



@Repository
public interface AccountRepository extends CrudRepository <Account, Long>{

}
