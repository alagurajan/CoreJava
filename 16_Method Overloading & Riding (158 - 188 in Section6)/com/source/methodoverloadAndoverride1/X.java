package com.source.methodoverloadAndoverride1;

public class X extends W
{
	void test(int i)	// Method overloading
	{
		System.out.println("from X");
	}

	public static void main(String[] args)
	{
		X obj	=	new X();
		obj.test();
		
		
	}

}
