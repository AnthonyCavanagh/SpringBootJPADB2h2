package com.cav.crud.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cav.entities.Cash;






@Repository
public interface CashRepository extends CrudRepository <Cash, String>{

}
