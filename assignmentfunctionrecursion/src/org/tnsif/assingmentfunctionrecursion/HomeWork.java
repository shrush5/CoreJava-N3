package org.tnsif.assingmentfunctionrecursion;


public class HomeWork {
	public int countDig(int n)
	{
		int count = 0;
		while(n!=0)
		{
			n = n/10;
			count = count+1;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[]= {456,3};
		int size = arr.length;
		
		 HomeWork obj = new  HomeWork();
		 for(int i =0; i< size;i++)
		 {
			 int count = obj.countDig(arr[i]);
			 System.out.println("The lenght of the number "+arr[i]+ " is "+count);
		 }
		
	

	}

}
