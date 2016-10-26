package com.source.object2;

public class Manager03
{

	public static void main(String[] args)
	{
		F f1	=	new F();
		f1.i=10;
		
		F f2	=	new F();
		f2.i=10;
		
		G g1	=	new G();
		g1.i=10;
		
		G g2	=	new G();
		g2.i=10;
		
		System.out.println(f1.equals(f1));
		System.out.println(g1.equals(g2));
		System.out.println("------");
		System.out.println(f1.equals(g1));
		System.out.println(g2.equals(f2));
		System.out.println("------");
	}

}
