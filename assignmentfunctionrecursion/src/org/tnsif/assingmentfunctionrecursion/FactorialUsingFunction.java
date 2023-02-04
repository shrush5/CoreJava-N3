package org.tnsif.assingmentfunctionrecursion;

import java.util.Scanner;

//To demonstrate example on factorial

public class FactorialUsingFunction {
	//Function definition
	static int factorial(int num)
	{
		int  fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=i*fact;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y :");
		int x=s.nextInt();
		int num = 3;
		System.out.println("Factorial of Given number is:"+factorial(num));
		s.close();
		
		
		

	}

}
