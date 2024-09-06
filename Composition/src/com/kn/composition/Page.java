package com.kn.composition;

public class Page {
	String name;
	int number;
	public Page(String name,int number ) {
		
		this.name = name;
		this.number = number;
	}
	public void data() {
		System.out.println(this.name+"data is very Simple");
		
	}
	

}
