package com.cav.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cav.onetomany.lazy.enties.Document;


@Repository
public interface DocumentRepository extends CrudRepository <Document, Long>{

}
