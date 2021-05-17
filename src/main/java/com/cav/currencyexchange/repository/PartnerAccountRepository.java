package com.cav.currencyexchange.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cav.currencyexchange.entities.PartnerAccount;




@Repository
public interface PartnerAccountRepository extends CrudRepository <PartnerAccount, String>{

}
