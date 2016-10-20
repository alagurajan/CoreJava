package com.source.sib1;

public class H
{
	static int i;
	
	static
	{
		//i=j;			//Compile time error Forward Reference 	(Uncomment this line) 
	}
	
	static int j=10;

	public static void main(String[] args)
	{
		System.out.println("Done");
	}

}
