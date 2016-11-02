package com.source.collections5;

class D<T>
{
	String s1;
	T s2;
}


public class Manager03
{

	public static void main(String[] args)
	{
		D<Integer> d1 = new D<Integer>();
		d1.s1="abc";
		d1.s2=100;
		
		D<String> d2 = new D<String>();
		d2.s1="abc";
		d2.s2="xyz";
		
		D<Double> d3 = new D<Double>();
		d3.s1="abc";
		d3.s2=9.989;
		
		System.out.println("Done");
	}

}
