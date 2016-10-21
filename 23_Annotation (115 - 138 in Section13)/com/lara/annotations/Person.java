package com.lara.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
abstract @interface Person
{
	public abstract String personFirstName();
	public abstract String personLastName();
	public abstract String personEmailId();
	public abstract String personAddress() default "Bangalore";
	public abstract int personAge() default 23;
}
