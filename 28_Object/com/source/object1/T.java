package com.source.object1;

class T
{	
	int i;
	T(int i)
	{
		this.i=i;
	}
	
	public boolean equals(Object obj)
	{
		T t1	=	(T) obj;
		return i==t1.i;
	}
}	
