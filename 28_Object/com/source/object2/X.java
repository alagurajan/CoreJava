package com.source.object2;

class X
{
	int i;
	
	public int hashCode()
	{
		String s1	=	Integer.toString(i);
		int i	=	s1.hashCode();
		return i;
	}
}
