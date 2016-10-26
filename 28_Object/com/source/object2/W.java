package com.source.object2;

class W
{
	int i;
	String j;
	char k;
	boolean m;
	
	public int hasCode()
	{
		String s1	=	Integer.toString(i);
		String s2	=	Character.toString(k);
		String s3	=	Boolean.toString(m);
		
		int hash	=	s1.hashCode();
		hash		+=	s2.hashCode();
		hash		+=  s3.hashCode();
		hash		+=	j.hashCode();
		
		return hash;
		
	}
}
