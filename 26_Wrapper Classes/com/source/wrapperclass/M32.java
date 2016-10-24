package com.source.wrapperclass;

public class M32
{

	public static void main(String[] args)
	{
		Boolean b1	=	new Boolean(true);
		
		if(b1)	//if(b1.booleanValue()) /******	Unboxing, will support JDK1.5 or later	*******/
		{
			System.out.println("Done");
		}
	}

}
