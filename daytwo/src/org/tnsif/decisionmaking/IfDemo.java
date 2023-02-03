package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		//Decision making if statement
		if(a==b)
			System.out.println("value of a equal to b");
		System.out.println("value of a not equal to b");

	}

}
