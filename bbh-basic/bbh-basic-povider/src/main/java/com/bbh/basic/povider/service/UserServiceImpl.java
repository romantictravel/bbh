package com.bbh.basic.povider.service;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.bbh.basic.api.UserService;
import com.bbh.basic.entity.User;


/**
 * Created by roman_000 on 2015/4/26.
 */
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
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
