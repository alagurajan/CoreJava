package com.source.innerclass1;

class F
{
	int i;
	static int j;
	
	void test1() 
	{
		i=1;
		j=2;
		test1();
		test2();
		G g1 = new G();
		H h1 = new H();
	}
	
	static void test2() 
	{
		//i=1;		/*****   static method only allow static members   *******/
		j=2;
		//test1();	/*****   static method only allow static method   *******/
		test2();
		//G g1 = new G();	/*****   static method only allow static Inner class   *******/
		H h1 = new H();
	}
	
	class G
	{
		int m;
		//static int n;		/*****   static member only allow with in the static innerclass   *******/
		void test3() 
		{
			i=10;
			j=20;
			test1();
			test2();
			G g1 = new G();
			H h1 = new H();
			m=20;
			//n=20			/*****   static member only allow with in the static innerclass   *******/
			
		}
		
		
		/*****   static method only allow with in the static innerclass   *******/
		/*
		static void test4() 
		{
			i=10;
			j=20;
			test1();
			test2();
			G g1 = new G();
			H h1 = new H();
			m=20;
			n=20;
		}
		*/
	}
	
	static class H
	{
		int p;
		static int q;
		
		void test5() 
		{
			//i=1;			/*****   cann't use the outerclass non-static members within this static innerclass   *******/
			j=2;
			//test1();		/*****   cann't use the outerclass non-static method within this static innerclass   *******/
			test2();
			p=0;
			q=9;
			//G g1 = new G();	/*****   cann't use another non-static innerclass within this static innerclass   *******/
			H h1 = new H();
			
		}
		
		static void test6() 
		{
			//i=10;		/*****   cann't use the outerclass non-static members within this static innerclass   *******/
			j=20;
			//test1();	/*****   cann't use the outerclass non-static methods within this static innerclass   *******/
			test2();
			//p=9;		/*****   cann't use another non-static innerclass members within this static innerclass   *******/
			q=10;
			//G g1 = new G();	/*****   cann't use another non-static innerclass  within this static innerclass   *******/
			H h1 = new H();
			
		}
	}
}
