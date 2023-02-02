package org.tnsif.intro;
import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// User input
		
		Scanner  sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		System.out.println("Enter the value of int");

		float y =sc.nextFloat();
		System.out.println("Enter the value of float");

		char z = sc.next().charAt(0);
		System.out.println("Enter the value of char");

		String name=sc.next();
		System.out.println("Enter the value of name");

		String str=sc.nextLine();
		System.out.println("Enter the value of str");

	//	double d=sc.nextDouble();
	//	System.out.println("Enter the value of double");
		
		System.out.println("The value of x is:" +x);
		System.out.println("The value of y is:" +y);
		System.out.println("The value of z is:" +z);
		System.out.println("The value of name is:" +name);
		System.out.println("The value of str is:" +str);
		//System.out.println("The value of d is:" +d);

	}

}
