package com.lara.annotations;

@Ann1(countValue=10)
public class L
{
	@Ann1					/*****   Usage are not mandatory as if declared as default with value   *******/
	public int test;
	
	@Ann1(someMessage="hello")
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}

}
