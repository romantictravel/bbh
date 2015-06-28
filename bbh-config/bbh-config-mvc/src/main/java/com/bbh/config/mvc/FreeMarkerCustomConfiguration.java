package com.bbh.config.mvc;

import com.bbh.common.utils.ConvertUtils;
import com.bbh.common.utils.settings.SettingUtils;
import com.bbh.common.utils.spring.PropertiesBeanUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactory;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import javax.servlet.ServletContext;
import java.util.Map;
import java.util.Properties;

/**
 * Created by roman_000 on 2015/6/21.
 */
@Configuration
@ConditionalOnWebApplication
@ConditionalOnClass({ freemarker.template.Configuration.class,
        FreeMarkerConfigurationFactory.class })
@AutoConfigureBefore({FreeMarkerAutoConfiguration.class})
@EnableConfigurationProperties({FreeMarkerExtendProperties.class})
public class FreeMarkerCustomConfiguration {
    @Autowired
     private  FreeMarkerExtendProperties properties;

    @Bean
    @ConditionalOnMissingBean(FreeMarkerConfig.class)
    public FreeMarkerConfigurer freeMarkerConfigurer(ApplicationContext context,ServletContext servletContext) {
        FreeMarkerConfigurer factory = new FreeMarkerConfigurer();
        factory.setTemplateLoaderPaths(properties.getTemplateLoaderPath());
        factory.setDefaultEncoding(properties.getCharset());
        //settings
        Properties settings = new Properties();
        settings.putAll(properties.getSettings());
        factory.setFreemarkerSettings(settings);
        //variables
        Map<String,Object> variables=properties.getVariables();
        PropertiesBeanUtils.transformBean(context, variables);
        variables.put("setting", SettingUtils.get());
        variables.put("base", servletContext.getContextPath());
        factory.setFreemarkerVariables(variables);
        return factory;
    }



}
