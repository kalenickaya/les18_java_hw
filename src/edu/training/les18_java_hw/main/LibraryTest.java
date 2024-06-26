package edu.training.les18_java_hw.main;

import edu.training.les18_java_hw.entity.Book;
import edu.training.les18_java_hw.entity.LibraryBook;

public class LibraryTest {

	public static void main(String[] args) {
		Book book1 = new Book("Java Programming", "John Doe");
		System.out.println(book1.displayInfo());
		
		Book book2 = new Book();
		System.out.println(book2.displayInfo());
		
		LibraryBook libraryBook1 = new LibraryBook("Design Patterns", "Jane Smith", 101);
		System.out.println(libraryBook1.displayInfo());
		
		LibraryBook libraryBook2 = new LibraryBook();
		System.out.println(libraryBook2.displayInfo()); 
		
		LibraryBook libraryBook3 = new LibraryBook("Java Programming", "John Doe");
		System.out.println(libraryBook3.displayInfo()); 
	}

}
