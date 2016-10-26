package com.source.object1;

class V
{
	int i;
	int j;
	
	V(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	
	public boolean equals(Object obj)
	{
		V v1			= (V)obj	;
		boolean flag	= (i==v1.i && j==v1.j);
		return flag;
	}
}
