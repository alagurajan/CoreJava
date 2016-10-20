package com.source.thisone;

public class L
{
	int i;
	void test1() 
	{
		System.out.println("from test1:"+i);
		i=10;
		test2();	// this.test2();
	}
	
	void test2() 
	{
		System.out.println("from test2:"+i);
		i=10;
	}

	public static void main(String[] args)
	{
		L obj = new L();
		
		System.out.println("main1:"+obj.i);
		obj.test1();
		System.out.println("main1:"+obj.i);
		obj.i=30;
		obj.test2();
		System.out.println("main1:"+obj.i);
		
	}

}
