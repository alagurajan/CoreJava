package com.source.object2;

class I
{
	int x;
	
	I(int x)
	{
		this.x=x;
	}
	
	public boolean equals(Object obj)
	{
		return (obj instanceof I && x==((I)obj).x);
	}
}
