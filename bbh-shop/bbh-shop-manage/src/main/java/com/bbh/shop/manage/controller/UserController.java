package com.bbh.shop.manage.controller;

import com.bbh.common.utils.captcha.service.CaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author BBH TEAM
 * @Description
 * @Date: 2015/5/11
 * @Version:1.0.0
 */
@Controller("/user")
public class UserController {

    //@Autowired
    private CaptchaService captchaService;
    @RequestMapping("/list")
    public void  list(){
        System.out.print("#################################"+captchaService.buildImage("2323232323232"));
    }

}
