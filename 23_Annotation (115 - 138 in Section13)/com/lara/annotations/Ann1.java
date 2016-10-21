package com.lara.annotations;

@interface Ann1
{
	public int countValue() default 1;
	public String someMessage() default "abc";
}
