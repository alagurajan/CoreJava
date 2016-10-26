package com.source.object2;

class G
{
	int i;
	
	public boolean equals(Object obj)
	{
		if(!(obj instanceof G))
		{
			return false;
		}
		
		return i==((G)obj).i;
	}

}
