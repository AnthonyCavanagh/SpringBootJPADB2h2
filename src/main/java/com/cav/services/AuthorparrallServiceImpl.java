package com.cav.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cav.crud.repository.AuthorRepository;
import com.cav.onetomany.lazy.enties.Author;

@Service
public class AuthorparrallServiceImpl implements AuthorServiceParrall {
	
	
	@Autowired
	AuthorRepository authorRepository;
	
	Long authorId;
	
	
	
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	@Override
	public Object call() throws Exception {
		System.out.println("Call enter");
		try {
		Author author = getAuthorWithFetch(authorId);
		System.out.println(author.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public AuthorparrallServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthorparrallServiceImpl(Long authorId) {
		super();
		this.authorId = authorId;
	}

	

	@Override
	public Author getAuthorWithFetch(Long authorId) {
		// TODO Auto-generated method stub
		return getDataP(authorId);
	}

	protected Author getDataP(Long authorId) {
		return authorRepository.findByAuthorId(authorId);
	}

}
