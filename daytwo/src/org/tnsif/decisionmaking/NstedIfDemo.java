package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NstedIfDemo {

	public static void main(String[] args) {

		System.out.println("Enter the age and weight of person");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<120)
				{
					System.out.println("Eligible for punjee jumping");
				}
				else
					System.out.println("Extra rope will be added");
			}	
		 else
		 {
			System.out.println("Not Eligibe");
		 }
		}
		else
		{
			System.out.println("Not Eligible");
		}
			
			
		

	}

}
