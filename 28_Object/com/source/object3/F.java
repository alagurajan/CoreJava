package com.source.object3;

class F implements Cloneable	/*****   Now F class object is eligible for cloning   *******/
{
	int i;
	
	void cloneUsage()
	{
		try 
		{
			F f1	=	(F)clone();
			System.out.println(f1.i);
		} 
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
