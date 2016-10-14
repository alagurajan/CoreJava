package com.source.instance.var;

public class N_128
{
	int i;
	
	public static void main(String[] args)
	{
		N_128 n1	=	new N_128();
		System.out.println(n1.i);
		N_128 n2	=	new N_128();
		System.out.println(n2.i);
		n1.i=10;
		n2.i=20;
		System.out.println(n1.i);
		System.out.println(n2.i);
	}

}
