package org.tnsif.typecastingdemo;

public class StaticVariable {
	private String name;
	
	public static String companyName="Persistant";

	

	public StaticVariable(String name) {
		super();
		this.name = name;
	}



	@Override
	public String toString() {
		return "StaticVariable [name=" + name + "]";
	}
	
	

}
