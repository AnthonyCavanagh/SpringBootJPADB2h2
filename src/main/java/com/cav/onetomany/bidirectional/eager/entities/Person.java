package com.cav.onetomany.bidirectional.eager.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Person {
  @Id
  private long id;
   
  private String name;
  
  @ManyToOne (cascade=CascadeType.ALL)
  @JoinColumn(name="DEPT_ID")
  private Department department;
  
  public Person() {}


public Person(long id, String name, Department department) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
}

public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
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
    return "Person [id=" + id + ", name=" + name + "]";
  }

}
