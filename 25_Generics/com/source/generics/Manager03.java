package com.source.generics;

public class Manager03
{

	public static void main(String[] args)
	{
		D<Integer> d1 	= 	new D<Integer>();
		d1.s2			=	100;
		d1.s1			=	"abc";
		
		D<String> d2 	= 	new D<String>();
		d2.s2			=	"xyz";
		d2.s1			=	"abc";
		
		D<Double> d3 	= 	new D<Double>();
		d3.s2			=	9.989;
		d3.s1			=	"abc";
		
		System.out.println("Done");
	}

}
