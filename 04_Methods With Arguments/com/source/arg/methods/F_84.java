package com.source.arg.methods;

public class F_84
{
	static void test(int i)
	{
		System.out.println("test:"+i);
		i=10;
	}

	public static void main(String[] args)
	{
		int i=20;
		System.out.println("main begin:"+i);
		test(i);
		System.out.println("main end:"+i);
	}
	
	/*
	 * Changes made in the test() is not reflect in main(). 
	 *  This is called call by value 
	 * 
	 * */

}
