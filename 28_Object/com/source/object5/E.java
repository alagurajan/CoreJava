package com.source.object5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface E
{

}
@Deprecated
@E
class F
{
	
}