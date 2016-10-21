package com.lara.annotations;

@interface Ann2
{
	public int countValue();
	public String someMessage() default "abc";
}
