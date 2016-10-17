package com.source.methodoverloadAndoverride1;

public class V extends U
{
	void test()				// Method Overriding
	{
		System.out.println("from V");
	}

	public static void main(String[] args)
	{
		V obj	=	new V();
		obj.test();
		
	}

}
