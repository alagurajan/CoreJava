package com.source.methodoverloadAndoverride2;

class Y extends X
{
	void test()
	{
		System.out.println("from Y");
		super.test();						//If we want to call super class method after overriding
		System.out.println("from Y");
	}

	public static void main(String[] args)
	{
		Y obj	=	new Y();
		obj.test();
	}

}
