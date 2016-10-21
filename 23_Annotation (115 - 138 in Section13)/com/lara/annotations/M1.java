package com.lara.annotations;

@Ann2(countValue=10)
public class M1
{
	//@Ann2(someMessage="Hello")				/*****   not set default value for countValue in annotation declaration   *******/	(Uncomment this line)
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}

}
