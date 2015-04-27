package com.bbh.basic.povider.service;

import com.bbh.basic.api.UserService;
import com.bbh.basic.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.PropertySources;

/**
 * Created by roman_000 on 2015/4/26.
 */
public class UserServiceImpl implements UserService {
    private  Logger logger= LoggerFactory.getLogger(this.getClass());
   // private Logger businessLogger = LoggerFactory.getLogger("business");
    //private Logger defaultLogger = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
    public  UserServiceImpl(){
       logger.info("############################logback 日志1#####################################");
      // businessLogger.info("##########################business 日志####################################");
      //  defaultLogger.info("##########################defaultLogger 日志####################################");
    }
    @Override
    public void save(User user) {





    }
}
