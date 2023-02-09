package org.tnsif.typecastingdemo;

//Driver class
public class StaticBlockExecuter {

	public static void main(String[] args) {
	System.out.println(StaticBlock.getName());
	
	StaticBlock s= new StaticBlock();
	s.setNum(14);
	System.out.println(s.getNum());

	}

}
