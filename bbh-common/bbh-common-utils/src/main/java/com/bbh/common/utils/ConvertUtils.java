package com.bbh.common.utils;

import java.math.BigDecimal;


public class ConvertUtils  extends org.apache.commons.beanutils.ConvertUtils{
    public static Integer convert2Integer(Object object){
        return convert(Integer.class,object);
    }  
    public static String convert2String(Object object){
    	return convert(object); 
    }  
    public static Boolean convert2Boolean(Object object){
    	return convert(Boolean.class,object);
    } 
    public static Long convert2Long(Object object){
    	return convert(Long.class,object);
    }
    public static Double convert2Double(Object object){
    	return convert(Double.class,object);
    }
	public static <T>T convert(Class<T> clazz,Object object){
    	return (T)convert(object,clazz); 
    }
}
