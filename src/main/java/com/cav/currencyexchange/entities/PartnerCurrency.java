package com.cav.currencyexchange.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "partnerCurrencies")
public class PartnerCurrency {
	
	@Id
	String partnerCurrencyId;
	String currency;
	String amount;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "part_curr_id")
	PartnerAccount partnerAccount;

	public PartnerCurrency() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartnerCurrency(String partnerCurrencyId, String currency, String amount, PartnerAccount partnerAccount) {
		super();
		this.partnerCurrencyId = partnerCurrencyId;
		this.currency = currency;
		this.amount = amount;
		this.partnerAccount = partnerAccount;
	}

	public String getPartnerCurrencyId() {
		return partnerCurrencyId;
	}

	public String getCurrency() {
		return currency;
	}

	public String getAmount() {
		return amount;
	}

	public PartnerAccount getPartnerAccount() {
		return partnerAccount;
	}

	@Override
	public String toString() {
		return "PartnerCurrency [partnerCurrencyId=" + partnerCurrencyId + ", currency=" + currency + ", amount="
				+ amount + "]";
	}
}
