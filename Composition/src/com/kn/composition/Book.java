package com.kn.composition;

public class Book {
	String name;
	Page page;
	public Book(String name) {
		
		this.name = name;
		this.page = new Page("Head First Java",05);
	}
public void readBook() {
	System.out.println("Release Stress");
	this.page.data();
}
	
	

}
