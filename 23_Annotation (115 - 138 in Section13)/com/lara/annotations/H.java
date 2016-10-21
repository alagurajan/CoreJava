package com.lara.annotations;

@SomeInfo(someMessage="some desc")
public class H
{
	
	@SomeInfo(someMessage="about i")
	int i;
	
	@SomeInfo(someMessage="about constructor")
	H()
	{
		
	}

	@SomeInfo(someMessage="about main")
	public static void main(String[] args)
	{
		System.out.println("Hello World");
	}

}
