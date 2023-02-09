package org.tnsif.superkeyword;
//To demonstrate example of super keyword

public class Flower {
	private String name;

	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//constructor

	public Flower() {
		System.out.println("Flower-Parent class");
	}

	public Flower(String name) {
		super();
		this.name = name;
	}
	
	

}
