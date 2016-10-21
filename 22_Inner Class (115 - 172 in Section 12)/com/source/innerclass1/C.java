package com.source.innerclass1;

class C
{
	int i;
	static int j;
	
	class D
	{
		
	}
	
	static class E
	{
		
	}
	
	void test1() 
	{
		i=1;
		j=2;
		
		D d1 = new D();
		E e1 = new E();
		test1();
		test2();
	}
	/*****   Only static members should be used inside the static method   *******/
	static void test2() 
	{
		//i=1;
		j=2;
		//D d1 = new D();
		E e1 = new E();
		//test1();
		test2();
	}
}
