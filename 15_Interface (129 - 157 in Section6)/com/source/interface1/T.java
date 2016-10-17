package com.source.interface1;

public class T extends S
{
 
	public int test2()
	{
		System.out.println("from test2");
		return 200;
	}

	public static void main(String[] args)
	{
		T t1	=	new T();
		t1.test1();
		System.out.println(t1.test2());
	}

}
