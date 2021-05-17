package com.cav.repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cav.FundRepository;
import com.cav.entities.Fund;


@SpringBootTest
@RunWith(SpringRunner.class)
public class TestRepository {
	
	@Autowired
	FundRepository fundRepository;
	
	@Test
	public void testFundOneObject() {
		
		LocalDateTime publishDate = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String publishDateTime = publishDate.format(formatter);
		
		LocalDateTime experationDate = publishDate.plusDays(1);
		String experationDateTime = experationDate.format(formatter);
		
		Fund fund = new Fund();
		fund.setFundId(1000101l);
		fund.setFundName("Fund1");
		fund.setBuy("101.5");
		fund.setBuy("102.5");
		fund.setPublishDate(publishDateTime);
		fund.setExpirationDate(experationDateTime);
		fundRepository.save(fund);
		System.out.println("Start Test");
	}
	


}
