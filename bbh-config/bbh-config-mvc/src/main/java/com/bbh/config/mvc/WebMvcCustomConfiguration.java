package com.bbh.config.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.MessageSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * Created by tancheng on 2015/5/30.
 */
@Configuration
@AutoConfigureAfter({DispatcherServletAutoConfiguration.class, MessageSourceAutoConfiguration.class})
public class WebMvcCustomConfiguration extends WebMvcConfigurerAdapter {
     @Autowired
     private MessageSource messageSource;

    @Override
    @Bean(name = "validator")
    public Validator getValidator() {
        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
        localValidatorFactoryBean.setValidationMessageSource(messageSource);
        return localValidatorFactoryBean;
    }



   /* *//**
     * 异常处理
     *
     * @return
     *//*
    @Bean
    @ConditionalOnMissingBean
    public SimpleMappingExceptionResolver exceptionResolver() {
        SimpleMappingExceptionResolver exceptionResolver = new SimpleMappingExceptionResolver();
        Map<String, String> view = properties.getView();
        exceptionResolver.setDefaultErrorView(view.get(ConstantsConfig.MVC_VIEW_ERROR));
        return exceptionResolver;
    }*/


}
