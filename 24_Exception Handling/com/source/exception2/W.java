package com.source.exception2;

class W
{
	void test() throws ClassNotFoundException
	{
		System.out.println(1);
		Class.forName("");
		System.out.println(2);
	}
}
