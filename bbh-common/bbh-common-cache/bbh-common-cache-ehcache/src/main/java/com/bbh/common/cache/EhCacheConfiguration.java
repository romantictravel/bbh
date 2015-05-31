package com.bbh.common.cache;

import net.sf.ehcache.CacheManager;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import com.bbh.common.constant.ConstantsConfig;
import org.springframework.util.ResourceUtils;

@Configuration
@EnableCaching
//@ConditionalOnResource(resources = {"ehcache.xml"})
public class EhCacheConfiguration implements ConstantsConfig {

    @Autowired
    private Environment environment;

    /**
     * org.springframework.cache.ehcache.EhCacheCacheManager
     * @param ehCacheManagerFactoryBean
     * @return
     */
    @Bean
    public EhCacheCacheManager ehCacheCacheManager(EhCacheManagerFactoryBean ehCacheManagerFactoryBean) {
        EhCacheCacheManager ehCacheCacheManager = new EhCacheCacheManager(ehCacheManagerFactoryBean.getObject());
        ehCacheCacheManager.setTransactionAware(true);
        return ehCacheCacheManager;
    }

    /**
     * org.springframework.cache.ehcache.EhCacheManagerFactoryBean
     * @return
     */
    @Bean
    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean() {
        EhCacheManagerFactoryBean cacheManagerFactoryBean = new EhCacheManagerFactoryBean();
        cacheManagerFactoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
        cacheManagerFactoryBean.setShared(true);
        return cacheManagerFactoryBean;
    }



}

