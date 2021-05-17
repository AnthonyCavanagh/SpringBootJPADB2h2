package com.cav.crud.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cav.manytomany.eager.entities.BondHolder;


@Repository
public interface BondHolderRepository extends CrudRepository<BondHolder, Long> {

}
