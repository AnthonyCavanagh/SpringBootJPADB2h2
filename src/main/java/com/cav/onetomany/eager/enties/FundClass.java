package com.cav.onetomany.eager.enties;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fundClass")
public class FundClass {
	
	@Id
	long fundClassId;
	String fundClassname;
	
	@ManyToOne(optional = false)
    @JoinColumn(name = "account_holder_id", nullable = false)
	AccountHolder accountHolder;

	

	public FundClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FundClass(long fundClassId, String fundClassname, AccountHolder accountHolder) {
		super();
		this.fundClassId = fundClassId;
		this.fundClassname = fundClassname;
		this.accountHolder = accountHolder;
	}

	public long getFundClassId() {
		return fundClassId;
	}

	public String getFundClassname() {
		return fundClassname;
	}

	public AccountHolder getAccountHolder() {
		return accountHolder;
	}

	@Override
	public String toString() {
		return "FundClass [fundClassId=" + fundClassId + ", fundClassname=" + fundClassname  + "]";
	}
}
