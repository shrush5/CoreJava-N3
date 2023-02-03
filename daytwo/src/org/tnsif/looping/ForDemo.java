package org.tnsif.looping;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		// to print 1 to N numbers
		for(int i=1; i<=n; i++)
		{
			System.out.println(i+" ");
		}
		
		// to print N to 1 numbers
		for(int i=n; i>=1; i--)
		{
			System.out.println(i+" ");
		}

	}

}
