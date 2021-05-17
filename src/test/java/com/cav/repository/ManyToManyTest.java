package com.cav.repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cav.crud.repository.BondHolderRepository;
import com.cav.crud.repository.BondRepository;
import com.cav.manytomany.eager.entities.Bond;
import com.cav.manytomany.eager.entities.BondHolder;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ManyToManyTest {
	
	@Autowired
	BondHolderRepository bondHolderRepository;
	
	@Autowired
    BondRepository bondRepository;

	@Test
	public void manyToManyTest() {
		System.out.println("Start Test");
		Bond bond = new Bond(11111l, "Bond1");
		bondRepository.save(bond);
		
		BondHolder bondHolder = new BondHolder(11111l, "BondHolder1");
		bondHolderRepository.save(bondHolder);
		bond.getBondHolders().add(bondHolder);
		
		bondHolder = new BondHolder(11112l, "BondHolder2");
		bondHolderRepository.save(bondHolder);
		bond.getBondHolders().add(bondHolder);
		
		bondRepository.save(bond);
		
		Optional<Bond> bondRepo = bondRepository.findById(11111l);
		bond = bondRepo.get();
		System.out.println(bond.toString());
		List<BondHolder> bondHolders = bond.getBondHolders();
		for(BondHolder bHolder : bondHolders) {
			System.out.println(bHolder.toString());
			List<Bond> bondsSet = bHolder.getBonds();
			System.out.println("Contains "+bondsSet.size());
			
		}
		System.out.println("Contains "+bondHolders.size());
		System.out.println("End Test");
	}
}
