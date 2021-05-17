package com.cav.crud.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cav.manytomany.eager.entities.Bond;

@Repository
public interface BondRepository extends CrudRepository<Bond, Long> {

}
