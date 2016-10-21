package com.lara.annotations;

@Counter(count=3)
public class I
{
	@Counter(count=5)
	int m;

	@Counter(count=10)
	I()
	{
		
	}
	
	@Counter(count=100)
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}

}
