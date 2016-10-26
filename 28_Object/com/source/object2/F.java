package com.source.object2;

class F
{
	int i;
	
	public boolean equals(Object obj)
	{
		if(!(obj instanceof F))
		{
			return false;
		}
		
		return i==((F)obj).i;
	}
}
