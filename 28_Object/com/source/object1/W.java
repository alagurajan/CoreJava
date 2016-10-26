package com.source.object1;

class W
{
	int i,j;
	double k,m;
	
	W(int i, int j, double k, double m)
	{
		this.i=i;
		this.j=j;
		this.k=k;
		this.m=m;
	}
	
	public boolean equals(Object obj)
	{
		W w1			=	(W)obj;
		boolean flag	=	((i==w1.i&&j==w1.j)&&(k==w1.k&&m==w1.m));
		
		return flag;
	}
}
