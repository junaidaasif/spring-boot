package com.techment.entity;

import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="author51")
public class Auth {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;

	@OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
	Set<Book> books;

	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public Auth() {
		
	}

	public Auth(String name) {
		super();
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Auth [id=" + id + ", name=" + name +  "]";
	}
	
	
	
	
	
	
}
