package com.source.object2;

class H
{
	int x;
	H(int x)
	{
		this.x=x;
	}
	
	public boolean equals(Object obj)
	{
		return (obj instanceof H && x==((H)obj).x);
	}
}
