package com.cav.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currencies")
public class Currency {

	
	@Id
    @GeneratedValue
    private long id;
	private String currencyId;
	private String country;
	
	
	public Currency() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Currency(String currencyId, String country) {
		super();
		this.currencyId = currencyId;
		this.country = country;
	}

	public long getId() {
		return id;
	}

	public String getCurrencyId() {
		return currencyId;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Currency [id=" + id + ", currencyId=" + currencyId + ", country=" + country + "]";
	}
}
