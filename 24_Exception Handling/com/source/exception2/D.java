package com.source.exception2;

class D
{
	int test1()
	{
		try
		{
			
		} 
		catch (ArithmeticException e)
		{
			
		}
		finally 
		{
			
		}
		
		return 10;
	}
	
	int test2()
	{
		try
		{
			
		} 
		catch (ArithmeticException ex)
		{
			
		}
		finally 
		{
			return 30;
		}
	}
	
//	int test3()
//	{
//		try
//		{
//			
//		} 
//		catch (ArithmeticException e)
//		{
//			
//		}
//		finally 
//		{
//			return 30;
//		}
//		
//		return 40;		// Unreachable Code
//	}
	
	int test4()
	{
		try
		{
			
		} catch (ArithmeticException e)
		{
		
		}
		finally 
		{
			
		}
		
		return 40;
	}
	
//	int test5()
//	{
//		try
//		{
//			return 20;
//		} 
//		catch (ArithmeticException e)
//		{
//			return 30;
//		}
//		finally 
//		{
//			
//		}
//		
//		return 40;		// Unreachable Code
//	}
	
//	int test6()
//	{
//		try
//		{
//			return 20;
//		} 
//		catch (ArithmeticException e)
//		{
//			return 30;
//		}
//		finally 
//		{
//			return 40;
//		}
//		
//		return 50;		// Unreachable Code
//	}
		
}
