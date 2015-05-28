package com.bbh.shop.manage;

import com.bbh.shop.manage.common.captcha.CaptchaEngine;
import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by roman_000 on 2015/5/28.
 */
@Configuration
public class ApplicationConfiguration {
    @Bean
    public DefaultManageableImageCaptchaService imageCaptchaService(){
        DefaultManageableImageCaptchaService   service=new DefaultManageableImageCaptchaService();
        service.setCaptchaEngine(new CaptchaEngine());
        service.setMinGuarantedStorageDelayInSeconds(3600);
        return  service;
    }

}
