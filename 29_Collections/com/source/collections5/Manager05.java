package com.source.collections5;

class F<Test>
{
	Test i;
	void method1(Test t) 
	{
		System.out.println("method1:");
	}
}

public class Manager05
{

	public static void main(String[] args)
	{
		F<String> f1 = new F<String>();
		F<Integer> f2 = new F<Integer>();
		f1.method1("abc");
		f2.method1(100);
		System.out.println("Done");
	}

}
