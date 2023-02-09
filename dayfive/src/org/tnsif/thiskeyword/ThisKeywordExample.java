package org.tnsif.thiskeyword;
//This keyword in constructor

class Main
{
	int num;
	Main()
	{
		
	}
	Main(int num)
	{
		this.num=num;
	}
}
//Driver Class
public class ThisKeywordExample {

	public static void main(String[] args) {
		Main obj = new Main(5);
		System.out.println("Num value : "+obj.num);
	}

}
