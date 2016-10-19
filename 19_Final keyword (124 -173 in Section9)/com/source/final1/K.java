package com.source.final1;

public class K
{

	public static void test(int i, final int j)
	{
		i=10;
		//j=10;	//The final local variable j cannot be assigned. It must be blank and not using a compound assignment	(uncomment this line)
		System.out.println(i);
		System.out.println(j);
	}

}
