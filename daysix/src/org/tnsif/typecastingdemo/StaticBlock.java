package org.tnsif.typecastingdemo;

//To Demonstrate an example of static block

public class StaticBlock {
	//non-static
	private int num;
	//static
	private static String name;
	
	
	//static bolck
	/*static block use to initialize static variable*/
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public static String getName() {
		return name;
	}


	public static void setName(String name) {
		StaticBlock.name = name;
	}


	static
	{
		name ="Shrushti";
	}

}
