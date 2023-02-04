package org.tnsif.assingmentfunctionrecursion;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count =0;
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of Digits in given integer are:"+count);
	

	}

}
