package com.source.thisone;

public class H
{
	void test() 
	{
		System.out.println("this:"+this);
	}

	public static void main(String[] args)
	{
		H h1 = new H();
		System.out.println("main:"+h1);
		h1.test();
	}

}
