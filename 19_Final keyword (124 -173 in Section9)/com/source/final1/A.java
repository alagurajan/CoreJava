package com.source.final1;

public class A
{

	public static void main(String[] args)
	{
		final int i	=10;
		int j=20;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("---------");
		System.out.println(i);
		System.out.println(j);
		System.out.println("---------");
		//i=10;	//The final local variable i cannot be assigned. It must be blank and not using a compound assignment		(Uncomment this line)
		j=20;
		System.out.println(i);
		System.out.println(j);
	}

}
