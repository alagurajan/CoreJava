package com.source.object1;

class U
{
	double j;
	U(double j)
	{
		this.j=j;
	}
	
	public boolean equals(Object obj)
	{
		boolean flag	=((U)obj).j	==	this.j;
		return flag;
	}
}
