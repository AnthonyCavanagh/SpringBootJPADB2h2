package com.cav.repository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.cav.currencyexchange.entities.PartnerAccount;
import com.cav.currencyexchange.entities.PartnerCurrency;
import com.cav.currencyexchange.repository.PartnerAccountRepository;
import com.cav.currencyexchange.repository.PartnerCurrencyRepository;


@SpringBootTest
@RunWith(SpringRunner.class)
public class TestCurrencyExchange {
	

	@Autowired
	PartnerAccountRepository partnerAccountRepository;
	
	@Autowired
	PartnerCurrencyRepository partnerCurrencyRepository;
	
	@Test
	public void testRepo() {
		System.out.println("Run Test");
		
		PartnerAccount partnerAccount = new PartnerAccount("PartnerA", "partnerName");
		if(partnerAccountRepository.existsById("partnerId")) {
			partnerAccountRepository.save(partnerAccount);
		}
		partnerCurrencyRepository.save(new PartnerCurrency("PartnerAGBP","GBP", "100000", partnerAccount));
		
		
	}

}
