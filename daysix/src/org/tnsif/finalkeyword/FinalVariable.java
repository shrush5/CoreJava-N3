package org.tnsif.finalkeyword;
//To Demonstrate exmaple of final keyword

public class FinalVariable{
	final static int x=15;
	public static void print()
	{
		//we can't change value of x as it is final
		//x=17;
		System.out.println("The value of x is :"+x);

	}
	
	public static void main(String args[])
	{
		 FinalVariable.print();
	}

}
