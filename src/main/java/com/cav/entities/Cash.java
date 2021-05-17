package com.cav.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cashes")
public class Cash {

	@Id
	String cashId;
	String cashName;
	
	public Cash() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cash(String cashId, String cashName) {
		super();
		this.cashId = cashId;
		this.cashName = cashName;
	}

	public String getCashId() {
		return cashId;
	}

	public String getCashName() {
		return cashName;
	}

	@Override
	public String toString() {
		return "Cash [cashId=" + cashId + ", cashName=" + cashName + "]";
	}
	
	
	
}
