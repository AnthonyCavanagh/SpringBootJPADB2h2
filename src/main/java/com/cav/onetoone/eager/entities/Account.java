package com.cav.onetoone.eager.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * One to one mapping
 * @author Tony
 *
 */

@Entity
@Table(name = "account")
public class Account {
	
	@Id
    private long accountId;
	private String accountName;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_adddress_id")
	private AccountAdddress accountAdddress;
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public AccountAdddress getAccountAdddress() {
		return accountAdddress;
	}
	public void setAccountAdddress(AccountAdddress accountAdddress) {
		this.accountAdddress = accountAdddress;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", accountAdddress="
				+ accountAdddress + "]";
	}
}
