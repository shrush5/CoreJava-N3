package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElseDemo {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
			System.out.println("A is greater");
		else if(b>a && b>c)
			System.out.println("B is greater");
		else
			System.out.println("C is greater");

	}

}
