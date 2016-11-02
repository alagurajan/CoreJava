package com.source.collections2;

import java.util.HashSet;

class I
{
	int x,y;
	
	I(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public int hashCode()
	{
		return Integer.toString(x).hashCode();
	}
	public boolean equals(Object obj)
	{
		return (obj instanceof I && x==((I)obj).x);
	}
}

public class Manager22
{

	public static void main(String[] args)
	{
		HashSet	set	=	new HashSet();
		set.add(new I(1,2));
		set.add(new I(1,3));
		set.add(new I(1,5));
		set.add(new I(2,1));
		System.out.println(set.size());
	}

}
