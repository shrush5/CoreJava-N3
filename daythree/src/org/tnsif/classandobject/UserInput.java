package org.tnsif.classandobject;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("The speed of car is : ");
		int speed=s.nextInt();
		Car c=new Car();
		c.display(speed);
		

	}
	

}
