package com.source.string6;

import java.text.NumberFormat;

public class X
{

	public static void main(String[] args)
	{
		NumberFormat nf		=	NumberFormat.getInstance();
		double num			=	245678.876893;
		System.out.println(num);
		System.out.println(nf.format(num));
	}

}
