package com.cav.services;

import java.util.concurrent.Callable;

import com.cav.onetomany.lazy.enties.Author;

public interface AuthorServiceParrall extends Callable<Object>{

	Author getAuthorWithFetch(Long authorId);
	
	void setAuthorId(Long authorId);
}
