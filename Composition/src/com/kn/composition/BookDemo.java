package com.kn.composition;

public class BookDemo {
	public static void main(String [] args) {
		Book b1=new Book("java");
		b1.readBook();
		b1=null;
		System.out.println("Tata Byee Byee");
		System.out.println(b1.page);
	}
}
