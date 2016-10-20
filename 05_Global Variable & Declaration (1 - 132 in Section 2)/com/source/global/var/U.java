package com.source.global.var;

public class U
{
	//static int i=j;
	static int j=10;
	static int i=j;			// Forward reference Error "j" is not declared by the time of initializer (Comment this line Uncomment 5th line)
	
	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(j);
	}

}
