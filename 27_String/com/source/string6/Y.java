package com.source.string6;

import java.text.NumberFormat;
import java.util.Locale;

public class Y
{

	public static void main(String[] args)
	{
		double num		=	876549.98767;
		NumberFormat nf	=	NumberFormat.getInstance(Locale.ITALIAN);
		System.out.println(num);
		System.out.println(nf.format(num));
	}

}
