package com.source.collections5;

interface J<A>
{
	void test1(A a1);
	A test2(A a1, int i);
}
class K implements J<String>
{
	public void test1(String s1) 
	{
		
	}
	public String test2(String s1, int i) 
	{
		return s1;
	}
}

public class Manager09
{

	public static void main(String[] args)
	{
		System.out.println("Done");
	}

}
