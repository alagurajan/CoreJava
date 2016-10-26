package com.source.object3;

class B
{
	int i,j;
	
	public B(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	
	public int hashCode()
	{
		System.out.println("hashCode");
		String s1	=	Integer.toString(i);
		String s2	=	Integer.toString(j);
		int hash	=	s1.hashCode();
		hash		+=	s2.hashCode();
		
		return hash;
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("equals");
		
		return (obj instanceof B && 
				((B)obj).i==i &&
				((B)obj).j==j);
	}
}
