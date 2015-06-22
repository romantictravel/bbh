package com.bbh.config.shiro;

import com.bbh.common.utils.captcha.engine.CaptchaEngine;
import com.bbh.common.utils.rsa.RSAService;
import com.bbh.common.utils.rsa.RSAServiceImpl;
import com.bbh.config.shiro.authentication.AuthenticationFilter;
import com.bbh.config.shiro.authentication.AuthenticationRealm;
import com.google.common.collect.Lists;
import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.config.Ini;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.ehcache.EhCacheManagerUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.filter.DelegatingFilterProxy;

@Configuration
@ConditionalOnExpression("${shiro.enabled:true}")
@EnableConfigurationProperties(ShiroProperties.class)
@EnableAspectJAutoProxy(proxyTargetClass = true)
@AutoConfigureAfter(CacheAutoConfiguration.class)
public class ShiroConfiguration {
    @Bean(name = "authenticationRealm")
    public AuthenticationRealm authenticationRealm() {
        AuthenticationRealm realm = new AuthenticationRealm();
        realm.setAuthorizationCacheName("authorization");
        return realm;
    }

    @Bean(name = "shiroCacheManager")
    public EhCacheManager shiroCacheManager(net.sf.ehcache.CacheManager ehCacheCacheManager) {
        EhCacheManager shiroEhCacheManager = new EhCacheManager();
        shiroEhCacheManager.setCacheManager(ehCacheCacheManager);
        return shiroEhCacheManager;
    }


    @Bean(name = {"securityManager"})
    public DefaultWebSecurityManager defaultWebSecurityManager(AuthenticationRealm authenticationRealm, EhCacheManager shiroCacheManager) {
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(authenticationRealm);
        defaultWebSecurityManager.setCacheManager(shiroCacheManager);
        return defaultWebSecurityManager;
    }


    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(ShiroProperties shiroProperties, DefaultWebSecurityManager securityManager) throws ClassNotFoundException {
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        factoryBean.setSecurityManager(securityManager);
        factoryBean.setLoginUrl(shiroProperties.getLoginUrl());
        factoryBean.setSuccessUrl(shiroProperties.getSuccessUrl());
        factoryBean.setUnauthorizedUrl(shiroProperties.getUnauthorizedUrl());
        factoryBean.setFilterChainDefinitionMap(getFilterChainDefinitions(shiroProperties));
        AuthenticationFilter authc = new AuthenticationFilter();
        factoryBean.getFilters().put("authc", authc);
        return factoryBean;
    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }


    @Bean
    public AuthorizationAttributeSourceAdvisor shiroAuthorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }


    @Bean
    public MethodInvokingFactoryBean staticSecurityManager(org.apache.shiro.mgt.SecurityManager securityManager) {
        MethodInvokingFactoryBean methodInvokingFactoryBean = new MethodInvokingFactoryBean();
        methodInvokingFactoryBean.setStaticMethod("org.apache.shiro.SecurityUtils.setSecurityManager");
        methodInvokingFactoryBean.setArguments(new Object[]{securityManager});
        return methodInvokingFactoryBean;
    }

    /**
     * 路径拦截Filter
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean shiroFilter(ShiroProperties shiroProperties) {
        FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
        filterRegBean.setFilter(new DelegatingFilterProxy("shiroFilter"));
        filterRegBean.setUrlPatterns(Lists.newArrayList(StringUtils.isNotBlank(shiroProperties.getFilterMappings()) ? shiroProperties.getFilterMappings() : ""));
        return filterRegBean;
    }

    /**
     * 将字符串转换成map
     *
     * @return
     */
    private Ini.Section getFilterChainDefinitions(ShiroProperties shiroProperties) {
        Ini ini = new Ini();
        ini.load(shiroProperties.getFilterChainDefinitions());
        Ini.Section section = ini.getSection("");
        //section.put("*//**", section.remove("*//**"));
        return section;
    }

    @Bean
    @ConditionalOnMissingBean
    public net.sf.ehcache.CacheManager ehCacheCacheManager() {
        return EhCacheManagerUtils.buildCacheManager();
    }

    @Bean(name = "rsaServiceImpl")
    @ConditionalOnMissingBean
    public RSAService rsaServiceImpl() {
        return new RSAServiceImpl();
    }

    @Bean(name = "imageCaptchaService")
    @ConditionalOnMissingBean
    public DefaultManageableImageCaptchaService imageCaptchaService() {
        DefaultManageableImageCaptchaService service = new DefaultManageableImageCaptchaService();
        service.setCaptchaEngine(new CaptchaEngine());
        service.setMinGuarantedStorageDelayInSeconds(3600);
        return service;
    }
}
