package org.arpit.java2blog.bean;

import java.io.Serializable;

public class Book implements Serializable {
    
    private static final long serialVersionUID = 1520961851058396786L;
    private long id;
    private String isbn;
    private String title;
    private String author;
    
    public Book() {
    }
	public Book(long id, String isbn, String title, String author) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title
				+ ", author=" + author + "]";
	}
    
	
}
