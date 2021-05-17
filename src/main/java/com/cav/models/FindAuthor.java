package com.cav.models;

public class FindAuthor {
	
	Long authorId;

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	@Override
	public String toString() {
		return "FindAuthor [authorId=" + authorId + "]";
	}

}
