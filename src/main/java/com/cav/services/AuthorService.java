package com.cav.services;

import com.cav.onetomany.lazy.enties.Author;

public interface AuthorService {

	
	void addAuthor(Author author);
	Author getAuthor(Long authorId);
	Author getAuthorWithFetch(Long authorId);
}
