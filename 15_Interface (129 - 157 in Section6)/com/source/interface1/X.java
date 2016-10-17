package com.source.interface1;

import com.source.interface1.W;

public class X extends W
{
		
	public double test3(boolean b)
	{
		System.out.println("from test3");
		return 29.89;
	}

	void test4()
	{
		System.out.println("from test4");
	}
	
	public static void main(String[] args)
	{
		X obj	=	new X();
		obj.test1();
		obj.test2(20);
		obj.test4();
		System.out.println("Done");
	}


}
