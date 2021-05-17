package com.cav.repository;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cav.crud.repository.AddressRepository;
import com.cav.crud.repository.UserRepository;
import com.cav.onetoone.bidirectional.eager.entities.Address;
import com.cav.onetoone.bidirectional.eager.entities.User;
import com.cav.onetoone.eager.entities.Account;
import com.cav.onetoone.eager.entities.AccountAdddress;
import com.cav.onetoone.repository.AccountRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OneToOneRepositoryTest {
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	UserRepository userRepository;
	
	
	@Autowired
	AddressRepository addressRepository;
	@Test
	public void runOneToOneTest() {
		System.out.println("Run Test");	
		
		
		AccountAdddress accountAdddress = new AccountAdddress();
		accountAdddress.setAccountAddressId(1111000L);
		accountAdddress.setAddressLine("20 matt street");
		accountAdddress.setCity("London");
		accountAdddress.setPostCode("TS159ua");
		
		Account account = new Account();
		account.setAccountId(100010l);
		account.setAccountName("Cavanagh");
		account.setAccountAdddress(accountAdddress);
		
		accountRepository.save(account);
		Optional<Account> repo = accountRepository.findById(100010l);
		account = repo.get();
		System.out.println(account.toString());
		System.out.println(account.getAccountAdddress().toString());
		System.out.println("End Test");
	}
	
	@Test
	public void runOneToOneBidirectionalTest() {
		System.out.println("Run Test");	
		User user = new User();
		user.setId(10001L);
		user.setUserName("Tony");
		
		Address address = new Address();
		address.setId(11100011L);
		address.setStreet("The street");
		address.setCity("London");
		address.setUser(user);
		user.setAddress(address);
		
		userRepository.save(user);
		
		Optional<User> userResp = userRepository.findById(10001L);
		user = userResp.get();
		System.out.println(user.toString());
		
		Optional<Address> addressResp = addressRepository.findById(11100011L);
		address = addressResp.get();
		System.out.println(address.toString());
		user = address.getUser();
		System.out.println(user.toString());
		System.out.println("End Test");
	}

}
