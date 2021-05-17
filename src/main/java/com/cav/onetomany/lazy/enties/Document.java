package com.cav.onetomany.lazy.enties;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "documents")
public class Document {
	
	@Id
	Long authorId;
	String name;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_document_id", nullable = false)
	Author author;

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Document(Long authorId, String name, Author author) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.author = author;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}
	
	

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Document [authorId=" + authorId + ", name=" + name + "]";
	}
	
	
	
	

}
