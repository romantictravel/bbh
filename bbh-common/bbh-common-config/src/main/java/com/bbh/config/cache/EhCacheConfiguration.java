package com.bbh.config.cache;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import com.bbh.common.constant.ConstantsConfig;

@Configuration
@ConditionalOnResource(resources = {"ehcache.xml"})
public class EhCacheConfiguration implements ConstantsConfig {

    @Autowired
    private Environment environment;

    @Bean
    public EhCacheCacheManager ehCacheCacheManager() {
        EhCacheCacheManager ehCacheCacheManager = new EhCacheCacheManager(ehCacheManagerFactoryBean().getObject());
        ehCacheCacheManager.setTransactionAware(true);
        return ehCacheCacheManager;
    }

    @Bean
    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean() {
        EhCacheManagerFactoryBean cacheManagerFactoryBean = new EhCacheManagerFactoryBean();
        if (StringUtils.isNotEmpty(this.environment.getProperty("ehcache.file"))) {
            cacheManagerFactoryBean.setConfigLocation(new ClassPathResource(this.environment.getProperty("ehcache.file")));
        }
        cacheManagerFactoryBean.setShared(true);
        return cacheManagerFactoryBean;
    }
}

