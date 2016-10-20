package com.source.enumone;

import com.source.enumone.M.En;

public class N
{
	enum en
	{
		CON1, CON2, CON3, CON4
	}

	public static void main(String[] args)
	{
		En all[]	=	En.values();
		
		for(int i=0; i<all.length; i++)
			System.out.println(all[i]);
	}

}
