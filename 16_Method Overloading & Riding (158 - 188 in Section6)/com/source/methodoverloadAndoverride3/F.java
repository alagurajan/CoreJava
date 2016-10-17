package com.source.methodoverloadAndoverride3;

class F
{
	F F;	/** <Return Type> <Variable Name> **/
	F FF; 	/** <Return Type> <Variable Name> **/
	
	F()		/** Constructor **/
	{		
	}
	
	F(F F)	/** Constructor with one argument **/
	{
	}
	
	F F()	/** <Derived Return Type> <Method Name> **/
	{
		return F;
	}
	
	F F(F F)	/** Method with one argument **/
	{
		return F;
	}
	
	F F(F F, F FF)	/** Method with two argument **/
	{
		return F;
	}
}
