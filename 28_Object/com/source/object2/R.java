package com.source.object2;

class R
{
	P param1;
	Q param2;
	String s1;
	Boolean flag;
	
	R(P param1, Q param2,String s1, Boolean flag)
	{
		this.param1=param1;
		this.param2=param2;
		this.s1=s1;
		this.flag=flag;
	}
	
	public boolean equals(Object o1)
	{
		return (o1 instanceof R &&
				((R)o1).param1	!= null &&
				((R)o1).param1.i==	param1.i &&
				((R)o1).param2	!=	null &&
				((R)o1).param2.equals(param2)&&
				((R)o1).s1	!=null &&
				((R)o1).s1.equals(s1) &&
				((R)o1).flag	!= null &&
				((R)o1).flag.equals(flag));
	}

}
