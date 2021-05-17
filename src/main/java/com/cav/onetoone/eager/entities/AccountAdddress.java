package com.cav.onetoone.eager.entities;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AccountAdddress {
	
	@Id
    private long accountAddressId;
	private String addressLine;
	private String city;
	private String postCode;
	

	public long getAccountAddressId() {
		return accountAddressId;
	}

	public void setAccountAddressId(long accountAddressId) {
		this.accountAddressId = accountAddressId;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "AccountAdddress [accountAddressId=" + accountAddressId + ", addressLine=" + addressLine + ", city="
				+ city + ", postCode=" + postCode + "]";
	}

}
