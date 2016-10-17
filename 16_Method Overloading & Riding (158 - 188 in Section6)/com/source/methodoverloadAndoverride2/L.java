package com.source.methodoverloadAndoverride2;

class L extends K
{
	//J test()	// It should be either "K" or "L"	"J" is a superclass of "K" not subclass		(Uncomment this line & comment next line)
	K test()
	{
		return null;
	}
}
