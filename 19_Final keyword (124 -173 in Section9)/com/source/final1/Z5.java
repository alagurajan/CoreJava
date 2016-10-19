package com.source.final1;

class Z5
{
	final int i;
	
	Z5()
	{					/**** Both constructor & IIB will be executed for every object creation ****/
		//i=10;			//The final field i may already have been assigned		(Uncomment this line)
	}
	
	{
		i=10;
	}
}
