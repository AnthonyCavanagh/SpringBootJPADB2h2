package com.cav.manytomany.eager.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bondHolders")
public class BondHolder {
	
	@Id
    private Long id;

    private String name;
    
    @ManyToMany(mappedBy = "bondHolders", fetch = FetchType.EAGER)
    private List<Bond> bonds = new ArrayList<Bond>();

	public BondHolder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BondHolder(Long id, String name) {
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

	public List<Bond> getBonds() {
		return bonds;
	}

	public void setBonds(List<Bond> bonds) {
		this.bonds = bonds;
	}

	@Override
	public String toString() {
		return "BondHolder [id=" + id + ", name=" + name + "]";
	}
}
