package com.cav.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cav.onetoone.bidirectional.eager.entities.Address;




@Repository
public interface AddressRepository extends CrudRepository <Address, Long>{

}
