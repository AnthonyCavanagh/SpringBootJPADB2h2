package com.cav.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cav.onetoone.bidirectional.eager.entities.User;





@Repository
public interface UserRepository extends CrudRepository <User, Long>{

}
