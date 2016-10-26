package com.source.object3;

class C
{
	int i,j,k;
	
	 
	public int hashCode()
	{
		String s1	=	Integer.toString(i);
		String s2	=	Integer.toString(k);
		int hash	=	s1.hashCode();
		hash		+=	s2.hashCode();
		
		return hash;
	}
	
	public boolean equals(Object obj)
	{
 		return (obj instanceof C && 
				((C)obj).i==i &&
				((C)obj).k==k);
	}
}
