package edu.training.les18_java_hw.entity;

import java.util.Objects;

public class LibraryBook extends Book {
	
	protected int shelfNumber;
	
	public LibraryBook() {
		super();
	}

	public LibraryBook(String title, String author, int shelfNumber) {
		super(title, author);
		this.shelfNumber = shelfNumber;
	}
	
	public LibraryBook (String title, String author) {
		this(title, author, -1);
	}

	public int getShelfNumber() {
		return shelfNumber;
	}

	public void setShelfNumber(int shelfNumber) {
		this.shelfNumber = shelfNumber;
	}
	
	@Override
	public String displayInfo() {
		return toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(shelfNumber);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibraryBook other = (LibraryBook) obj;
		return shelfNumber == other.shelfNumber;
	}

	@Override
	public String toString() {
		return "LibraryBook [shelfNumber=" + shelfNumber + ", title=" + title + ", author=" + author + "]";
	}
	
}
