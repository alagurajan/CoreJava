package com.source.object2;

class Y
{
	int k;
	String s1;
	boolean b1;
	X x1;
	
	public int hasCode()
	{
		String str1	=	Integer.toString(k);
		String str2	=	Boolean.toString(b1);
		int hash	=	0;
		
		hash		=	str1.hashCode();
		hash		+=	str2.hashCode();
		
		if(s1!=null)
		{
			hash	+=	s1.hashCode();
		}
		if(x1!=null)
		{
			hash	+= x1.hashCode();
		}
		
		return hash;
	}
}
