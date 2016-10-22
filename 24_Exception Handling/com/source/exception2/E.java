package com.source.exception2;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;

public class E
{
	
	void test1()
	{
		System.out.println(1);
		int i=10/0;
		System.out.println(2);
	}
	
	void test2()
	{
		System.out.println(1);
		try
		{
		
		}
		catch (ArithmeticException e)
		{
			
		}
		
		System.out.println(2);
	}
	
	void test3()
	{
		System.out.println(1);
		int i	=	Integer.parseInt("abc");
		System.out.println(2);
	}
	
	void test4()
	{
		System.out.println(1);
		try
		{
			
		} 
		catch (NumberFormatException e)
		{
			System.out.println(e);
		}
		System.out.println(2);
	}
	
	void test5()
	{
		System.out.println(1);
		String s1	=	null;
		s1.length();
		System.out.println(2);
	}
	
	void test6()
	{
		System.out.println(1);
		try
		{
			
		} 
		catch (NullPointerException e)
		{
			
		}
		System.out.println(2);
	}
	
	void test7()
	{
		Object obj	=	new Object();
		E e1		=	(E) obj;
	}
	
	void test8()
	{
		test8();
	}
	
	void test9()
	{
		try
		{
			
		} 
		catch (StackOverflowError e)
		{
			
		}
	}
	
	void test10()
	{
		int x[]=	new int[999999999];	/*********		OutofMemory Unchecked Exception		*********/
	}
	
	void test11()
	{
		try
		{
			
		} 
		catch (NoClassDefFoundError e) /*********		UnChecked Exception		*********/
		{
			
		}
	}
	
//	void test12()
//	{
//		Class.forName("");	/*********		Checked Exception		*********/
//	}
	
	void test13()
	{
		try
		{
			Class.forName("");
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
//	void test14()
//	{
//		try
//		{
//			Class.forName("");
//		} 
//		catch (NullPointerException e)
//		{
//			e.printStackTrace();
//		}
//	}
	
//	void test15()
//	{
//		try
//		{
//			
//		} 
//		catch (ClassNotFoundException e)
//		{
//			e.printStackTrace();
//		}
//	}
	
//	void test16()
//	{
//		try
//		{
//			System.out.println("done");
//		} catch (ClassNotFoundException e)
//		{
//			e.printStackTrace();
//		}
//	}
	
	void test17()
	{
		try
		{
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
		} 
		catch (ClassNotFoundException e)
		{
			
		}
	}
	
//	void test18()
//	{	
//		DriverManager.getConnection("");
//	}
	
	void test19()
	{
		try
		{
			DriverManager.getConnection("");
		}
		catch (SQLException e)
		{
			
		}
	}
	
//	void test20()
//	{
//		try
//		{
//			Class.forName("");
//		} 
//		catch (SQLException e)
//		{
//			
//		}
//	}
	
	void test21()
	{
		try
		{
			Class.forName("");
			DriverManager.getConnection("");
		} 
		catch (SQLException e)
		{
			
		}
		catch (ClassNotFoundException e) 
		{
			
		}
	}
	
//	void test22()
//	{
//		new FileWriter("");
//	}
	
	void test23()
	{
		try
		{
			new FileWriter("");
		} 
		catch (IOException e)
		{
			
		}
	}
	
//	void test24()
//	{
//		try
//		{
//			
//		} 
//		catch (IOException e)
//		{
//			
//		}
//	}
	
//	void test25()
//	{
//		clone();
//	}
	
	void test26()
	{
		try
		{
			clone();
		} 
		catch (CloneNotSupportedException e)
		{
			
		}
	}
	
//	void test27()
//	{
//		try
//		{
//			
//		}
//		catch (CloneNotSupportedException e)
//		{
//			e.printStackTrace();
//		}
//	}
	
//	void test28()
//	{
//		Thread.sleep(1000);
//	}
	
	void test29()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
		
		}
	}
	
//	void test30()
//	{
//		try
//		{
//			
// 		}
//		catch (InterruptedException e)
//		{
//		
//		}
//	}
	
//	void test31()
//	{
//		DateFormat df	=	DateFormat.getDateInstance();
//		df.parse("");
//	}
	
	void test32()
	{
		DateFormat df	=	DateFormat.getDateInstance();
		
		try
		{
			df.parse("");
		} 
		catch (ParseException e)
		{
			
		}
	}
	
//	void test33()
//	{
//		try
//		{
//			
// 		} 
//		catch (ParseException e)
//		{
//			
//		}
//	}

}
