package com.source.exception2;

class C
{
	int test1()
	{
		try
		{
			
		} catch (NullPointerException e)
		{
			
		}
		catch (ArithmeticException e) 
		{
		
		}
		
		return 10;
	}
	
	int test2()
	{
		try
		{
			return 10;
		} 
		catch (NullPointerException e)
		{
			return 20;
		}
		catch (ArithmeticException e)
		{
			return 30;
		}
	}
	
//	int test3()
//	{		
//		try
//		{
//			// return type is missing
//		} 
//		catch (NullPointerException e)
//		{
//			return 20;
//		}
//		catch (ArithmeticException e)
//		{
//			return 20;
//		}
//	}
	
	int test4()
	{
		try
		{
			
		} catch (NullPointerException e)
		{
			return 20;
		}
		catch (ArithmeticException e)
		{
			return 30;
		}
		
		return 300;
	}
	
//	int test5()
//	{
//		try
//		{
//			
//		}
//		catch (NullPointerException e)
//		{
//			
//		}
//		catch (ArithmeticException e)
//		{
//			return 30;
//		}
//		
//	}
	
	int test6()
	{
		try
		{
			
		}
		catch (NullPointerException e)
		{
			
		}
		catch (ArithmeticException e)
		{
			return 30;
		}
		
		return 300;
	}
	
//	int test7()
//	{
//		try
//		{
//			return 30;
//		}
//		catch (NullPointerException e)
//		{
//			return 40;
//		}
//		catch (Exception e) 
//		{
//			return 50;
//		}
//		
//		return 70;		// Unreachable code
//	}
}
