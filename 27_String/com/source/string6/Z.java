package com.source.string6;

import java.text.NumberFormat;
import java.util.Locale;

public class Z
{

	public static void main(String[] args)
	{
		NumberFormat nf1	=	NumberFormat.getInstance();
		NumberFormat nf2	=	NumberFormat.getInstance(Locale.FRANCE);
		
		double num			=	9876578.98089;
		System.out.println(num);
		
		System.out.println(nf1.format(num));
		System.out.println(nf2.format(num));
	}

}
