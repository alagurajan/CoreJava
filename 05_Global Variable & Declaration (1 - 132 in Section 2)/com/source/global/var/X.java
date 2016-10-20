package com.source.global.var;

public class X_125
{
	static int test1()
	{
		return 1;
	}
	
	static int i= test1()+ test2();		// Here method "test1()" is Regular reference  method "test2()" is Forward Reference 
	
	static int test2()
	{
		return 2;
	}
	
	public static void main(String[] args)
	{
		System.out.println(i);
	}

}
