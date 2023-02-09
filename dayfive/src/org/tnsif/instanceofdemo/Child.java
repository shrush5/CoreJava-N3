package org.tnsif.instanceofdemo;

//to demonstrate instance of operator


public class Child extends Person {
	private int age;
    //getter and setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	public Child(String name,String address,int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	

	
	
	

}
