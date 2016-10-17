package com.source.inher.one;

public class H extends G {

	H()
	{
		super(10);
		System.out.println("H()");
	}

	H(int i)
	{
		super(i);
		System.out.println("H(int)");
	}

	public static void main(String[] args) 
	{
		H h1	=	new H();
		System.out.println("--------");
		H h2	=	new H(10);
		System.out.println("--------");
		G g1	=	new G(90);
		System.out.println("--------");
		G g2	=	new G();
		System.out.println("--------");
	}

}
