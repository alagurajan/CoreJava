package com.source.casting2;

public class Manager18
{
	static void test1(B b1)
	{
		System.out.println("from test1(B)");
	}

	public static void main(String[] args)
	{
		A a1	=	new B();
		//test1(a1);		//The method test1(B) in the type Manager18 is not applicable for the arguments (A)		(Uncomment this line)
		System.out.println("Done");
	}

}
