package me.domain;

import java.sql.Date;

public class Book {
	private Integer id;
	private String name;
	private String author;
	private Date publicationDate;
	private Double price;
	
	public Book(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublication() {
		return publicationDate;
	}

	public void setPublication(Date publication) {
		this.publicationDate = publication;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publication=" + publicationDate + ", price="
				+ price + "]";
	}
	
}
