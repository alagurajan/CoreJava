package com.source.object2;

class Q
{
	int i;
	
	Q(int i)
	{
		this.i=i;
	}
	
	public boolean equals(Object o1)
	{
		return (o1 instanceof Q && ((Q)o1).i==i);
	}
}
