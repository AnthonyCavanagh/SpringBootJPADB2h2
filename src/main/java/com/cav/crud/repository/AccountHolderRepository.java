package com.cav.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cav.onetomany.eager.enties.AccountHolder;




@Repository
public interface AccountHolderRepository extends CrudRepository <AccountHolder, Long>{

}
