package org.tnsif.typecastingdemo;
//Program on Typecasting

public class TypecastingDemo {

	public static void main(String[] args) {
		
		//implicit typecasting Example

		int x=15;
		float y=x;
		System.out.println("The value of y is : "+y);
		
		//Explicit typecasting
		
		double d=12.5d;
		long l=(long)d;
		System.out.println("The value of l is : "+l);
		
		
		int f=24;
		double e=(double)f;
		System.out.println("The value of e is : "+e);

	}

}
