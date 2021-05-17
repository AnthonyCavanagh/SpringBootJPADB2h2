package com.cav.onetomany.lazy.enties;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {

	
	@Id
	Long authorId;
	String name;
	
	@OneToMany(mappedBy = "author", 
            cascade = CascadeType.ALL)
	Set <Document> documents;
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Author(Long authorId, String name) {
		super();
		this.authorId = authorId;
		this.name = name;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public String getName() {
		return name;
	}
	
	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + "]";
	}

}
