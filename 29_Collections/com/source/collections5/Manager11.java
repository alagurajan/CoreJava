package com.source.collections5;
class P
{

}
class Q extends P
{

}
class R extends Q
{

}
class S extends R
{

}

class T1<A extends P>
{
	A i;
}

public class Manager11
{

	public static void main(String[] args)
	{
		T1<P> t1	=	new T1<P>();
		T1<Q> t2	=	new T1<Q>();
		T1<R> t3	=	new T1<R>();
		T1<S> t4	=	new T1<S>();
		//T<String> t5	=	new T<String>();
		
		System.out.println("Done");

	}

}
