package com.cav.services;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cav.crud.repository.AuthorRepository;
import com.cav.crud.repository.DocumentRepository;
import com.cav.onetomany.lazy.enties.Author;
import com.cav.onetomany.lazy.enties.Document;

@Service
public class AuthorServiceImpl extends BaseService implements AuthorService{
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	DocumentRepository documentRepository;

	@Override
	public void addAuthor(Author author) {
		if(!authorRepository.existsById(author.getAuthorId())) {
			Author authorRep = new Author(author.getAuthorId(), author.getName());
			authorRepository.save(authorRep);
		}
		for(Document document : author.getDocuments()) {
			document.setAuthor(author);
			documentRepository.save(document);
			
		}
		
	}

	@Override
	public Author getAuthor(Long authorId) {
		Set <Document> docs = new HashSet<Document>();
		Author author = new Author(1111101L, "Cavanagh");
		docs.add(new Document(111111L, "document1", author));
		docs.add(new Document(111112L, "document2", author));
		author.setDocuments(docs);
		Optional<Author> respAuth = authorRepository.findById(authorId);
		return respAuth.get();
	}

	@Override
	public Author getAuthorWithFetch(Long authorId) {
		// TODO Auto-generated method stub
		return getData(authorId);
	}

}
