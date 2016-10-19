package com.source.final1;

class X
{
	final int i;
	
	X()
	{
		i=0;
	}
	
	X(int j)
	{
		final int I;
		i=0;			//The blank final field i may not have been initialized		(Comment this line)
	}
}
