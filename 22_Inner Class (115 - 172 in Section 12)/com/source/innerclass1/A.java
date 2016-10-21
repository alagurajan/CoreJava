package com.source.innerclass1;

class A
{
	int i;
	static int j;
	
	void test1() 
	{
		i=20;
		j=30;
		test2();
	}
	
	/*****   Only static members should be used inside the static method   *******/
	static void test2() 
	{
		//i=20;
		j=30;
		//test1();
		test2();
	}
}
