package org.tnsif.assingmentfunctionrecursion;

import java.util.Scanner;

public class ExampleOfRecursion {
	
	//function definition
	static int factorial(int num)
	{
		if(num!=0)
			return num*factorial(num-1);
		return 1;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//System.out.println("Enter the value of x and y :");
		int x=s.nextInt();
		int num = 3;
		System.out.println("Factorial of Given number is:"+factorial(num));
		s.close();

	}

}
