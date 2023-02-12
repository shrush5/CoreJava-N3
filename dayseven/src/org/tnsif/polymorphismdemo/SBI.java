package org.tnsif.polymorphismdemo;

public class SBI extends RBI {
	//override method from parent class
		float getInterest()
		{
			System.out.println("RBI Interest: "+super.getInterest());
			return 12.8f;
		}

}
