package com.cav.onetomany.bidirectional.eager.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
  @Id
  private long id;
  private String name;
  
  public Department() {
	super();
	// TODO Auto-generated constructor stub
  }


  public Department(long id, String name) {
	super();
	this.id = id;
	this.name = name;
}



  @OneToMany(targetEntity=Person.class, fetch = FetchType.EAGER,mappedBy="department")
  private Set<Person> pers = new HashSet<Person>();
  
  
  public Set<Person> getPers() {
	return pers;
}


public void setPers(Set<Person> pers) {
	this.pers = pers;
}


public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Department [id=" + id + ", name=" + name + ", persons=" + pers
        + "]";
  }

}
