package com.st.il.borrowerapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "tbl_author")
public class Author {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authorId;
	
	@Column(name="authorName")
	private String authorName;
	
	public Author() {}
	
	public Author(int authorId, String authorName) {
		this.authorId = authorId;
		this.authorName = authorName;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + "]\n";
	}
}