package com.source.exception2;

class B
{
	int test(String s1)
	{
		try
		{
			//some statement	
		}
		catch (NumberFormatException e)
		{
			
		}
		
		return 20;
	}
	
	int test1(String s1)
	{
		try
		{
			return 1;	
		} 
		catch (NumberFormatException e)
		{
			return 0;
		}
	}
	
//	int test2(String s1)
//	{
//		try
//		{
//			// Some Statements
//			// return type is missing
//		} catch (NumberFormatException e)
//		{
//			return 0;
//		}
//	}
	
	int test3(String s1)
	{
		try
		{
			//Some statement
		} 
		catch (NumberFormatException e)
		{
			return 0;
		}
		
		return 500;
	}
	
//	int test4(String s1)
//	{
//		try
//		{
//			return 20;
//		} 
//		catch (NumberFormatException e)
//		{
//			
//		}
//		
//	}
	
	int test5(String s1)
	{
		try
		{
			return 20;
		} 
		catch (NumberFormatException e)
		{
			
		}
		
		return 30;
	}
	
//	int test6(String s1)
//	{
//		try
//		{
//			return 20;
//		} 
//		catch (NumberFormatException e)
//		{
//			return 0;
//		}
//		
//		return 30
//	}
}
