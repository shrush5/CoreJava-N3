package org.tnsif.assingmentfunctionrecursion;

public class AssignmentQ2 {
	static int sum_of_digit(int n)
	{
		if(n==0)
			return 0;
		return(n % 10 +sum_of_digit(n/10));
	}

	public static void main(String[] args) {
		int num = 1234;
		int result = sum_of_digit(num);
		System.out.println("Sum of Digits in "+num + " is " + result);

	}

}
