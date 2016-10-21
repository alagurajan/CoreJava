package com.lara.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
/*****   
 * Element Types Are
 *    
 *    1.CONSTRUCTOR	(Constructor declaration)
 *    2.FIELD	(Field declaration (include enum constant))
 *    3.LOCAL_VARIABLE	(Local variable declaration)
 *    4.METHOD	(Method declaration)
 *    5.PACKAGE	(Package declaration)
 *    6.PARAMETER	(Parameter declaration)
 *    7.TYPE	(Class, interface (including annotation type), or enum declaration) *    
 *    
 *    *******/
@Target(ElementType.FIELD)
@interface Ann4
{
	public String someMessage();
}
