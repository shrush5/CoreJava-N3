package org.tnsif.thiskeyword;
class HR
{
	void display(HR obj)
	{
		System.out.println("Human Resource");
	}
	void accept()
	{
		display(this);
	}
}

public class ThisKeywordExecutor {

	public static void main(String[] args) {
		HR obj = new HR();
		obj.accept();
		
		

	}

}
