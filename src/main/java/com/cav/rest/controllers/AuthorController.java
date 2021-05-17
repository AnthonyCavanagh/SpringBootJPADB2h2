package com.cav.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cav.models.FindAuthor;
import com.cav.onetomany.lazy.enties.Author;
import com.cav.services.AuthorService;

@RestController
@RequestMapping("/authorservice")
public class AuthorController {
	
	private static final Logger logger = LoggerFactory.getLogger(AuthorController.class);
	@Autowired
	AuthorService authorService;
	
	@RequestMapping(value = "/findAuthor/", method = RequestMethod.POST)
	public Author findAuthor(@RequestBody FindAuthor findAuthor) {
		logger.info("findAuthor "+findAuthor.toString());
		return authorService.getAuthor(findAuthor.getAuthorId());
	}
	
	@RequestMapping(value = "/updateAuthor/", method = RequestMethod.POST)
	public Author upadteAuthor(@RequestBody Author author) {
		logger.info("findAuthor "+author.toString());
		authorService.addAuthor(author);
		return author;
	}

}
