package com.source.string5;

public class T
{

	public static void main(String[] args)
	{
		int i	=2345;
		
		System.out.printf("(%-010d)",i); 			//IllegalFormatFlagsException: Flags = '-0'
	}

}
