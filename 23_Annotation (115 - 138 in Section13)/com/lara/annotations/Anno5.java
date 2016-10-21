package com.lara.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*****   
 *
 * RetentionPolicy
 * 
 * 1.CLASS	(Annotations are to be recorded in the class file by the compiler but need not be retained by the VM at run time)
 * 2.RUNTIME(Annotations are to be recorded in the class file by the compiler and retained by the VM at run time, so they may be read reflectively.)
 * 3.SOURCE	(Annotations are to be discarded by the compiler.)
 *    
 ******/

@Retention(RetentionPolicy.SOURCE)		/*****   Annotations are to be discarded by the compiler.   *******/
@interface Anno5
{
	public int countValue();
}
