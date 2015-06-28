package com.bbh.common.utils.spring;

import com.bbh.common.utils.ConvertUtils;
import com.bbh.common.utils.Exceptions;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

import java.util.Map;

/**
 * 将properties文件beanName为#开头的配置转换成spring bean
 * Created by roman_000 on 2015/6/27.
 */
public class PropertiesBeanUtils {
   private   static  final String  PREFIX="#";
   private   static Logger logger = LoggerFactory.getLogger(PropertiesBeanUtils.class);
   public static Object getBean(ApplicationContext context,String beanName){
       if(StringUtils.startsWith(beanName,PREFIX)&&StringUtils.length(beanName)>0){
           try{
               beanName=StringUtils.substring(beanName,1);
               return context.getBean(beanName);
           }catch (BeansException ex){
               logger.error(Exceptions.getStackTraceAsString(ex));
           }
       }
       return null;
   }

    public static void transformBean(ApplicationContext context, Map<String, Object> objectMap) {
        if(MapUtils.isNotEmpty(objectMap)){
            String beanName;
            for(Map.Entry<String,Object> obj: objectMap.entrySet()){
                beanName= ConvertUtils.convert(obj.getValue());
                objectMap.put(obj.getKey(),getBean(context,beanName));
            }
        }
    }


}
