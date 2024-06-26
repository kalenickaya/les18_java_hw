package edu.training.les18_java_hw.entity;

import java.util.Objects;

public class Book {

	protected String title;
	protected String author;
	
	public Book() {
		
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
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
	
	public String displayInfo() {
		return toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
}
