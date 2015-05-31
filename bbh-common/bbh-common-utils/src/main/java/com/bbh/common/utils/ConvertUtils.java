package com.bbh.common.utils;

import java.math.BigDecimal;


public class ConvertUtils  extends org.apache.commons.beanutils.ConvertUtils{
    public static Integer integerConvert(Object object){  
        return convert(Integer.class,object);
    }  
    public static String stringConvert(Object object){  
    	return convert(object); 
    }  
    public static Boolean booleanConvert(Object object){  
    	return convert(Boolean.class,object);
    } 
    public static Long longConvert(Object object){  
    	return convert(Long.class,object);
    }
    public static Double doubleConvert(Object object){  
    	return convert(Double.class,object);
    }
    public static BigDecimal bigDecimalConvert(Object object){  
    	return convert(BigDecimal.class,object);
    }
	public static <T>T convert(Class<T> clazz,Object object){  
    	return (T)convert(object,clazz); 
    }
}
