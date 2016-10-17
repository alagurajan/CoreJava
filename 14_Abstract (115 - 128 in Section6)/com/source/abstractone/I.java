package com.source.abstractone;

class I extends H
{

	@Override
	void test1()
	{
		System.out.println("from test1");
	}

	@Override
	void test2()
	{
		System.out.println("from test2");
	}

	@Override
	void test3()
	{
		System.out.println("from test3");
	}

	public static void main(String[] args)
	{
		//H obj1	=	new H();		//Cannot instantiate the type H			(Uncomment this line)
		I obj2		=	new I();
		obj2.test1();
		obj2.test2();
		obj2.test3();
		System.out.println("Done");
	}

}
