package com.source.string6;

import java.text.NumberFormat;
import java.util.Locale;

public class Z4
{

	public static void main(String[] args)
	{
		double num	=	234859.98766;
		
		NumberFormat nf1	=	NumberFormat.getCurrencyInstance(Locale.ITALY);
		NumberFormat nf2	=	NumberFormat.getCurrencyInstance(Locale.FRENCH);
		
		String s1			=	nf1.format(num);
		String s2			=	nf2.format(num);
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
