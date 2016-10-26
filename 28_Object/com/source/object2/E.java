package com.source.object2;

class E
{
	int i;
	
	public boolean equals(Object obj)
	{
		E e		=	(E)obj;
		return i==e.i;
	}
}
