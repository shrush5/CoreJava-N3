package org.tnsif.typecastingdemo;

public class StaticMethod {
	
	//private data members
	private static double salary=84000;
	public static void display() {
		System.out.println("The salary is :"+salary);
	}

	//we can use getter and setter for setting the salary
	/*public void display()
	{
		System.out.println("The salary is :"+salary);
	}*/
	public static double getSalary() {
		return salary;
	}
	public static void setSalary(double salary) {
		StaticMethod.salary = salary;
	}
	
	
	

}
