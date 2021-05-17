package com.cav.repository.jpa;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import com.cav.entities.Currency;
import com.cav.jpa.repository.CurrencyRepository;


@SpringBootTest
@RunWith(SpringRunner.class)
public class PagingTest {
	
	@Autowired
	CurrencyRepository currencyRepository;
	
	//@Test
	public void testJPA() {
		System.out.println("Start Test ");
		Currency currency = null;
		String currencyId = "currencyId";
		String countryName = "countryName";
		for(int index=0; index < 20; index++) {
			currency = new Currency(currencyId+index, countryName+index);
			currencyRepository.save(currency);
		}
		
		List<Currency> currencyResp = currencyRepository.findAll();
		printCollection(currencyResp);
	}
	
	@Test
	public void testJPAPaging() {
		
		System.out.println("Start Paging Test ");
		/*
		Currency currency = null;
		String currencyId = "currencyId";
		String countryName = "countryName";
		for(int index=0; index < 20; index++) {
			currency = new Currency(currencyId+index, countryName+index);
			currencyRepository.save(currency);
		}*/
		System.out.println("Get via paging ");
		Pageable paging = PageRequest.of(0, 15, Sort.by("country"));
		Page<Currency> currencyPage = currencyRepository.findAll(paging);
		printPage(currencyPage);
		
		//List<Currency> currencyResp = currencyRepository.findAll();
		//printCollection(currencyResp);

	}
	
	
	private void printCollection(Collection<Currency> currencyResp) {
		currencyResp.forEach(c -> System.out.println(c));
	}
	
	private void printPage(Page<Currency> currencyResp) {
		currencyResp.forEach(c -> System.out.println(c));
	}

}
