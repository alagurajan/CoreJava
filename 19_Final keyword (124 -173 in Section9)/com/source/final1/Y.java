package com.source.final1;

class Y
{
	final int i;
	Y()
	{
		i=10;
	}
	Y(int i)
	{
		i=10;	/*** This is local variable initializer ****/
		this.i=10;	//The blank final field i may not have been initialized		(Comment this line)
		
	}
}
