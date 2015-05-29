package com.bbh.shiro.core;

import net.sf.ehcache.CacheManager;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingClass(name = {"com.hyxt.data.cache.EhCacheConfiguration"})
public class EhCacheConfiguration {
    @Bean
    public EhCacheCacheManager ehCacheCacheManager(CacheManager cacheManager) {
        EhCacheCacheManager ehCacheCacheManager = new EhCacheCacheManager(cacheManager);
        ehCacheCacheManager.setTransactionAware(true);
        return ehCacheCacheManager;
    }

    @Bean
    public CacheManager cacheManager(EhCacheManagerFactoryBean ehCacheManagerFactoryBean) {
        return ehCacheManagerFactoryBean.getObject();
    }

    @Bean
    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean() {
        EhCacheManagerFactoryBean cacheManagerFactoryBean = new EhCacheManagerFactoryBean();

        cacheManagerFactoryBean.setShared(true);

        return cacheManagerFactoryBean;
    }
}
