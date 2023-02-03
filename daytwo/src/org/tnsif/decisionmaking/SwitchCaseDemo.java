package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Kesariyan");
			break;
		
		case 2:
			System.out.println("Ved");
			break;
			
		case 3:
			System.out.println("Calm Down");
			break;
			
		default:
			System.out.println("Explore More!!!!!");
			break;
		}
		
		

	}

}
