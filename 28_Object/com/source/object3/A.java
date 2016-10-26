package com.source.object3;

class A
{
	int i,j;
	
	A(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	
	public String toString()
	{
		return "i="+i+",j="+j;
	}
	
	public boolean equals(Object obj)
	{
		return (obj instanceof A &&
				((A)obj).i==i &&
				((A)obj).j==j);
	}
	
	public int hashCode()
	{
		String s1	=	Integer.toString(i);
		String s2	=	Integer.toString(j);
		int hash	=	s1.hashCode();
		hash		+=	s2.hashCode();
		
		return hash;
	}
}
