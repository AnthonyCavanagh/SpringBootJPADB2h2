package com.cav.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.cav.onetomany.lazy.enties.Author;
import com.cav.services.AuthorService;
import com.cav.services.AuthorServiceParrall;
import com.cav.services.AuthorparrallServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AuthorServiceTest {

	@Autowired
	AuthorService authorService;
	
	@Autowired
	AuthorServiceParrall authorServiceParrall;
	
	@Test
	public void testAuthor() {
		System.out.println("Run test");
		Author author = authorService.getAuthor(10101L);
		System.out.println(author.toString());
		author = authorService.getAuthorWithFetch(10101L);
		System.out.println(author.toString());
	}
	
	@DirtiesContext
	@Test
	public void testAuthorParrall() {
		System.out.println("Run test");
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		authorServiceParrall.setAuthorId(10101L);
		executor.submit(authorServiceParrall);
		executor.shutdown();
		
	}
	
}
