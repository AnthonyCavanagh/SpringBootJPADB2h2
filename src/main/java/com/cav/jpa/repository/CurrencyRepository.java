package com.cav.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cav.entities.Currency;

public interface CurrencyRepository extends JpaRepository <Currency, Long>{

}
