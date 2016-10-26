package com.source.object2;

class M
{
	L param1;
	int param2;
	
	M(L param1, int param2)
	{
		this.param1=param1;
		this.param2=param2;
	}
	
	public boolean equals(Object o1)
	{
		return (o1 instanceof M && ((M)o1).param1!=null && ((M)o1).param1.i==param1.i && param2==((M)o1).param2);
	}

}
