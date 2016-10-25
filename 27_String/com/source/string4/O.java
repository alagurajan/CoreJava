package com.source.string4;

public class O
{

	public static void main(String[] args)
	{
		E.find("a1b2c3d45e89&97%26", "\\d");	/******	return as number (individual no)*******/
		System.out.println("-------");
		
		E.find("a1b2c3d45e89&97%26", "\\d+");	/******	return as number *******/
		System.out.println("-------");
	}

}
