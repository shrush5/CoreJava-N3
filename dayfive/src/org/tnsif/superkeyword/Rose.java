package org.tnsif.superkeyword;

//This is Child class

public class Rose extends Flower{
private String name;

	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//constructor

	public Rose() {
		System.out.println("Flower-Parent class");
	}

	public Rose(String name) {
		super();
		this.name = name;
	}
	
	public void display()
	{
		System.out.println(name);
		super.setName("Flower");
		System.out.println(super.getName());
		
	}
}
