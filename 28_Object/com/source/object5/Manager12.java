package com.source.object5;

public class Manager12
{

	public static void main(String[] args) throws Exception
	{
		Class c1	=	Class.forName("com.source.object5.O");
		O obj		=	(O)c1.newInstance();
		System.out.println("Done");
		
		/*****   InstantiationException: com.source.object5.O   *******/
	}

}
