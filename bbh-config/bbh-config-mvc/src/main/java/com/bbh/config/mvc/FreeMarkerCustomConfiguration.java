package com.bbh.config.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactory;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;

import java.util.Properties;

/**
 * Created by roman_000 on 2015/6/21.
 */
@Configuration
@AutoConfigureBefore({FreeMarkerAutoConfiguration.FreeMarkerWebConfiguration.class,
        FreeMarkerAutoConfiguration.FreeMarkerNonWebConfiguration.class})
@EnableConfigurationProperties({FreeMarkerProperties.class,FreeMarkerExtendProperties.class})
public class FreeMarkerCustomConfiguration {
    @Autowired
    protected FreeMarkerProperties properties;
    @Autowired
    protected FreeMarkerExtendProperties extendProperties;
    @Bean
    public FreeMarkerConfigurationFactoryBean freeMarkerConfiguration() {
        FreeMarkerConfigurationFactoryBean freeMarkerFactoryBean = new FreeMarkerConfigurationFactoryBean();
        applyProperties(freeMarkerFactoryBean);
        freeMarkerFactoryBean.setFreemarkerVariables(null);
        return freeMarkerFactoryBean;
    }

    protected void applyProperties(FreeMarkerConfigurationFactory factory) {
        factory.setTemplateLoaderPaths(this.properties.getTemplateLoaderPath());
        factory.setDefaultEncoding(this.properties.getCharset());
        Properties settings = new Properties();
        settings.putAll(this.properties.getSettings());
        factory.setFreemarkerSettings(settings);
    }
}
