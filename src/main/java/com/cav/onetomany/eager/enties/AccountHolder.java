package com.cav.onetomany.eager.enties;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "accountHolder")
public class AccountHolder {
	
	@Id
	Long accountHolderId;
	String accountName;
	
	@OneToMany(mappedBy = "accountHolder", 
			fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
	Set <FundClass> fundClasses;

	public AccountHolder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountHolder(Long accountHolderId, String accountName) {
		super();
		this.accountHolderId = accountHolderId;
		this.accountName = accountName;
	}

	public Set<FundClass> getFundClasses() {
		return fundClasses;
	}

	public void setFundClasses(Set<FundClass> fundClasses) {
		this.fundClasses = fundClasses;
	}

	public Long getAccountHolderId() {
		return accountHolderId;
	}

	public String getAccountName() {
		return accountName;
	}

	@Override
	public String toString() {
		return "AccountHolder [accountHolderId=" + accountHolderId + ", accountName=" + accountName + ", fundClasses="
				+ fundClasses + "]";
	}
}
