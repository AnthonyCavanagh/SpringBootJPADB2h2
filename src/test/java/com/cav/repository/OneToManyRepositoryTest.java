package com.cav.repository;

import java.util.Optional;
import java.util.Set;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cav.crud.repository.AccountHolderRepository;
import com.cav.crud.repository.AuthorRepository;
import com.cav.crud.repository.DocumentRepository;
import com.cav.crud.repository.FundClassRepository;
import com.cav.onetomany.eager.enties.AccountHolder;
import com.cav.onetomany.eager.enties.FundClass;
import com.cav.onetomany.lazy.enties.Author;
import com.cav.onetomany.lazy.enties.Document;


@SpringBootTest
@RunWith(SpringRunner.class)
public class OneToManyRepositoryTest {
	
	@Autowired
	AccountHolderRepository accountHolderRepository;
	
	@Autowired
	FundClassRepository fundClassRepository;
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	DocumentRepository documentRepository;
	
	@Test
	public void runOneToManyEagerTest() {
		System.out.println("Run Test");	
		AccountHolder accountHolderCavanagh = new AccountHolder(11101L, "Cavanagh Holdings");
		accountHolderRepository.save(accountHolderCavanagh);
		
		
        FundClass cavFund = new FundClass(10101l, "cavFundOne", accountHolderCavanagh);
        fundClassRepository.save(cavFund);
        
        cavFund = new FundClass(10102l, "cavFundTwo", accountHolderCavanagh);
        fundClassRepository.save(cavFund);
        Optional<AccountHolder> resp = accountHolderRepository.findById(11101L);
		System.out.println(resp.get().toString());
		
		
		Optional<FundClass> fundResp = fundClassRepository.findById(10101l);
		cavFund = fundResp.get();
		System.out.println(cavFund.toString());
		AccountHolder accountHolder = cavFund.getAccountHolder();
		System.out.println(accountHolder.toString());
		System.out.println("End Test");
	}
	
	@Test
	public void runOneToManyLazyTest() {
		System.out.println("Run Test");	
		Author author = new Author(10101L,"Tony");
		authorRepository.save(author);
		Document document = new Document(10101L,"Spring",author);
		documentRepository.save(document);
		
		Optional<Author> authResp = authorRepository.findById(10101L);
		author = authResp.get();
		System.out.println(author.toString());
	}
	
	@Test
	public void runOneToManyLazyJPAQueryTest() {
		System.out.println("Run Test");	
		Author author = new Author(10101L,"Tony");
		authorRepository.save(author);
		Document document = new Document(10101L,"Spring",author);
		documentRepository.save(document);
		
		author= authorRepository.findByAuthorId(10101L);
		System.out.println(author.toString());
		Set<Document> docs = author.getDocuments();
		System.out.println(docs.size());
	}


}
