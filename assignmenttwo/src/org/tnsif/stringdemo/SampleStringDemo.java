package org.tnsif.stringdemo;
//example to demonstrate an example on string creation
import java.util.Scanner;

public class SampleStringDemo {
 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	//using string literal
	/*System.out.println("enter the first string");
	String str1=s.nextLine();
	System.out.println("first string is:"+str1);
	//using new keyword
	System.out.println("enter the first string");
	String str2=new String(s.nextLine());
	System.out.println("second string is:"+str2);
	//if(str1==str2)
	//{
		//System.out.println("same");
	//}
	if(str1.equals(str2))
	{
		System.out.println("same");
	}
	else
	{
		System.out.println("different");
	}*/
	//character array string
	char c[]= {'h','e','l','l','o'};
	String str3= new String(c);
	System.out.println(str3);
}	

}