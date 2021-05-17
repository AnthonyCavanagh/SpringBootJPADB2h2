package com.cav.crud.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cav.onetomany.lazy.enties.Author;





@Repository
public interface AuthorRepository extends CrudRepository <Author, Long>{
	@Query("select a from Author a JOIN FETCH a.documents d where (a.authorId = :authorId)")
	Author findByAuthorId(@Param("authorId")Long authorId);
}
