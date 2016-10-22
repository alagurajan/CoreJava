package com.source.generics;

public class Manager13
{

	public static void main(String[] args)
	{
		Z<?>	z1	=	null;
		z1	=	new Z<Integer>();
		z1	=	new Z<Number>();
		z1	=	new Z<Object>();
		z1	=	new Z<String>();
		z1	=	new Z<S>();
		
		Z<? extends Number>	z2	=	null;
		z2	=	new Z<Integer>();
		z2	=	new Z<Number>();
//		z2	=	new Z<Object>();
//		z2	=	new Z<String>();
//		z2	=	new Z<S>();
		
		Z<? super Number>	z3	=	null;
//		z3	=	new Z<Integer>();
		z3	=	new Z<Number>();
		z3	=	new Z<Object>();
//		z3	=	new Z<String>();
//		z3	=	new Z<S>();
		
		Z<? extends R>	z4	=	null;
//		z4	=	new Z<P>();
//		z4	=	new Z<Q>();
		z4	=	new Z<R>();
		z4	=	new Z<S>();
//		z4	=	new Z<Object>();
//		z4	=	new Z<String>();		
		
		Z<? super Q>	z5	=	null;
		z5	=	new Z<P>();
		z5	=	new Z<Q>();
//		z5	=	new Z<R>();
//		z5	=	new Z<S>();
		z5	=	new Z<Object>();
//		z5	=	new Z<String>();
	}

}
