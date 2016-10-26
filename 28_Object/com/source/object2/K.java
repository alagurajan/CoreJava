package com.source.object2;

class K
{
	J param1;
	int param2;
	
	K(J param1, int param2)
	{
		this.param1	=	param1;
		this.param2	=	param2;
	}
	
	public boolean equals(Object obj)
	{
		K obj1	=	(K)obj;
		return (obj1.param1.i==param1.i && obj1.param2==param2);
	}
}
