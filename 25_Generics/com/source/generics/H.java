package com.source.generics;

class H<X>
{
	X i;
	
	H()
	{
		
	}
	H(X i)
	{
		this.i=i;
	}
	
	void set(X i)
	{
		this.i=i;
	}
	
	X get()
	{
		return i;
	}

}
