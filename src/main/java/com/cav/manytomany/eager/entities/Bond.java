package com.cav.manytomany.eager.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "bonds")
public class Bond {
	
	@Id
    private Long id;

    private String name;
    
    @ManyToMany(fetch = FetchType.EAGER , cascade = CascadeType.PERSIST)
    @JoinTable(name = "bondHolder_bond", joinColumns = @JoinColumn(name = "bond_id"), inverseJoinColumns = @JoinColumn(name = "bondHolder_id"))
    private List<BondHolder> bondHolders = new ArrayList<BondHolder>();

    
	public Bond() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bond(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<BondHolder> getBondHolders() {
		return bondHolders;
	}

	public void setBondHolders(List<BondHolder> bondHolders) {
		this.bondHolders = bondHolders;
	}

	@Override
	public String toString() {
		return "Bond [id=" + id + ", name=" + name + "]";
	}
	
	
}
