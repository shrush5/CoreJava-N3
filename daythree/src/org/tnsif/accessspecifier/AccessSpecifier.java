package org.tnsif.accessspecifier;

public class AccessSpecifier {
	
	//data members
	private String name="Hii MET";
	/*if any data member is default it will
	access only in same pakage
	 */
	public void display()
	{
		System.out.println("The name is : "+name);
	}
	//getter and setter for private 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
