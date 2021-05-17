package com.cav.currencyexchange.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cav.currencyexchange.entities.PartnerCurrency;


@Repository
public interface PartnerCurrencyRepository extends CrudRepository <PartnerCurrency, String>{

}
