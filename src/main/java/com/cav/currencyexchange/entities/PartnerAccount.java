package com.cav.currencyexchange.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "partnerAccount")
public class PartnerAccount {

	
	@Id
	String partnerAccountId;
	String partnerAccountName;
	
	@OneToMany(mappedBy = "partnerAccount", 
            cascade = CascadeType.ALL)
	Set <PartnerCurrency> partnerCurrencies;
	
	public PartnerAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public PartnerAccount(String partnerAccountId, String partnerAccountName) {
		super();
		this.partnerAccountId = partnerAccountId;
		this.partnerAccountName = partnerAccountName;
	}



	public String getPartnerAccountId() {
		return partnerAccountId;
	}

	public void setPartnerAccountId(String partnerAccountId) {
		this.partnerAccountId = partnerAccountId;
	}

	public String getPartnerAccountName() {
		return partnerAccountName;
	}
	
	public void setPartnerAccountName(String partnerAccountName) {
		this.partnerAccountName = partnerAccountName;
	}

	public Set<PartnerCurrency> getPartnerCurrencies() {
		return partnerCurrencies;
	}

	public void setPartnerCurrencies(Set<PartnerCurrency> partnerCurrencies) {
		this.partnerCurrencies = partnerCurrencies;
	}

	@Override
	public String toString() {
		return "PartnerAccount [partnerAccountId=" + partnerAccountId + ", partnerAccountName=" + partnerAccountName
				+ ", partnerCurrencies=" + partnerCurrencies + "]";
	}

	
	

}
