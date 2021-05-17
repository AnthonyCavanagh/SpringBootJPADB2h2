package com.cav.services;

import org.springframework.beans.factory.annotation.Autowired;


import com.cav.crud.repository.AuthorRepository;
import com.cav.onetomany.lazy.enties.Author;


public abstract class BaseService {
	
	
	@Autowired
	AuthorRepository authorRepository;
	

	protected Author getData(Long authorId) {
		return authorRepository.findByAuthorId(authorId);
	}

}
