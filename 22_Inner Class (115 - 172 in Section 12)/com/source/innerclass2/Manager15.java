package com.source.innerclass2;

public class Manager15
{

	public static void main(String[] args)
	{
		D d1	=	new D()
				{
					{
						System.out.println("AIC-IIB");
					}
					
				};
		System.out.println("------------");
		
		D d2	=	new D(10)
				{
					{
						System.out.println("AIC-IIB");
					}
				};
	}

}
