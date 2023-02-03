package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		//Decision making if else statement
		if(a>b)
			System.out.println("a is greater than b");
		else
			System.out.println("a is not greater than b");

	}

}
