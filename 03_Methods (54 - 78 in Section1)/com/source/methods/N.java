package com.source.methods;

public class N
{
	static void test()
	{
		System.out.println("test begin");
		//return;			// Compile time error when you un comment this line. (return statement should be the last line of the method. )
		System.out.println("test end");
	}

	public static void main(String[] args)
	{
		test();
	}

}
