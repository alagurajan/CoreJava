package com.source.wrapperclass;

public class M11
{

	public static void main(String[] args)
	{
		double d1	=	45.987;
		String s1	=	"67.9898";
		
		/******	Instead of constructors we are using static valeOf() method	*******/
		
		Double d2	=	Double.valueOf(d1);
		Double d3	=	Double.valueOf(s1);
		
		double d4	=	d2.doubleValue();
		double d5	=	d3.doubleValue();
		
		System.out.println("Done");
	}

}
