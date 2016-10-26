package com.source.object1;

class Person
{
	String name;
	int age;
	
	public String toString()
	{
		String s1	=	"Address:"+super.toString();
		String s2	=	"State: name="+name+",age="+age;
		return s1+" and "+s2;
	}

}
