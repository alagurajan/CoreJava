package com.source.innerclass1;

public class G
{
	class H
	{
		
	}
	
	static class I
	{
		
	}
	
	/*****   Any class can be used anywhere, if the usage is the datatype usage   *******/
	
	public static void main(String[] args) 
	{
		H h1	= 	null;
		I i1	=	null;
		
		//h1	=	new H();		/*****   This is non-static innerclass   *******/
		i1=new I();					/*****   This is static innerclass   *******/
		System.out.println("Done");
	}

}
