package org.tnsif.instanceofdemo;
//to demonstrate instance of operator

public class Person {
	
	private String name;
	private String address;
	
	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person()
	{
		System.out.println("parent class");
	}
	
	
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	

}
