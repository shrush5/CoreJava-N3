package org.tnsif.wrapperclassdemo;

//program to demonstrate on auto and unboxing
public class WrapperClassDemo {

	public static void main(String[] args) {
		//AutoBoxing
		int x=18;
		Integer y=x;
		System.out.println(y);
		
		//UnBoxing
		Integer i= new Integer(10);
		System.out.println(i);
		int b=i.intValue();
		System.out.println(b);

	}

}
