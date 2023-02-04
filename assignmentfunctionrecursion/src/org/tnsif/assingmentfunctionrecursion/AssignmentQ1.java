package org.tnsif.assingmentfunctionrecursion;
//Fibbonacci series
//WAP to find the n'th term in fibbonacci series using recursion note that first two terms in fibbonacci series are 0 and 1

public class AssignmentQ1 {
	static int fib(int n)
	{
		if(n==0||n==1)
			return 0;
		else if(n==2)
			return 1;
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		int n = 9;
		System.out.println(fib(n));

	}

}
