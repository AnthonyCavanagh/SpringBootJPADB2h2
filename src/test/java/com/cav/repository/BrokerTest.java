package com.cav.repository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cav.crud.repository.CashRepository;
import com.cav.entities.Cash;




@SpringBootTest
@RunWith(SpringRunner.class)
public class BrokerTest {
	
	@Autowired
	CashRepository cashRepository;
	
	@Test
	public void testStringId() {
		System.out.println("Run Test");
		cashRepository.save(new Cash("brokerId","BrokerName"));
		cashRepository.existsById("brokerId");
	}

}
