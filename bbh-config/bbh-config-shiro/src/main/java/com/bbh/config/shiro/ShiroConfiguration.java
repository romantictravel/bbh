package com.bbh.config.shiro;

import com.bbh.common.utils.captcha.engine.CaptchaEngine;
import com.bbh.common.utils.rsa.RSAService;
import com.bbh.common.utils.rsa.RSAServiceImpl;
import com.bbh.config.shiro.authentication.AuthenticationFilter;
import com.bbh.config.shiro.authentication.AuthenticationRealm;
import com.google.common.collect.Lists;
import com.octo.captcha.Captcha;
import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.config.Ini;
import org.apache.shiro.mgt.*;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.ehcache.EhCacheManagerUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.filter.DelegatingFilterProxy;
@Configuration
@ConditionalOnExpression("${shiro.enabled:true}")
@EnableConfigurationProperties(ShiroProperties.class)
@AutoConfigureAfter(CacheAutoConfiguration.class)
public class ShiroConfiguration {
    @Autowired
    private ShiroProperties shiroProperties;

    @Bean(name="authenticationRealm")
    public AuthenticationRealm authenticationRealm() {
        AuthenticationRealm realm = new AuthenticationRealm();
        realm.setAuthorizationCacheName("authorization");
        return realm;
    }

    @Bean(name = "shiroCacheManager")
    public EhCacheManager shiroCacheManager(net.sf.ehcache.CacheManager  ehCacheCacheManager) {
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
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultWebSecurityManager securityManager) throws ClassNotFoundException {
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        factoryBean.setSecurityManager(securityManager);
        factoryBean.setLoginUrl(shiroProperties.getLoginUrl());
        factoryBean.setSuccessUrl(shiroProperties.getSuccessUrl());
        factoryBean.setUnauthorizedUrl(shiroProperties.getUnauthorizedUrl());
        factoryBean.setFilterChainDefinitionMap(getFilterChainDefinitions());

        AuthenticationFilter authc = new AuthenticationFilter();
        factoryBean.getFilters().put("authc", authc);
        return factoryBean;
    }

   /* @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }*/

    /**
     * 开启Shiro的注解(如@RequiresRoles,@RequiresPermissions),需借助SpringAOP扫描使用Shiro注解的类,并在必要时进行安全逻辑验证
     * 本例中未使用,配置以下两个bean即可实现此功能
    @Bean
    @DependsOn({"lifecycleBeanPostProcessor"})
    public DefaultAdvisorAutoProxyCreator shiroDefaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator creator = new DefaultAdvisorAutoProxyCreator();
        creator.setProxyTargetClass(true);
        return creator;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor shiroAuthorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }*/


    /*   @Bean
    public  void  initShrio(org.apache.shiro.mgt.SecurityManager  securityManager){
        MethodInvokingFactoryBean methodInvokingFactoryBean=new MethodInvokingFactoryBean();
        methodInvokingFactoryBean.setStaticMethod("org.apache.shiro.SecurityUtils.setSecurityManager");
        methodInvokingFactoryBean.setArguments(new Object[]{securityManager});
    }*/

    /**
     *路径拦截Filter
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean shiroFilter() {
        FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
        filterRegBean.setFilter(new DelegatingFilterProxy("shiroFilter"));
        filterRegBean.setUrlPatterns(Lists.newArrayList(StringUtils.isNotBlank(shiroProperties.getFilterMappings()) ? shiroProperties.getFilterMappings() : ""));
        return filterRegBean;
    }

    /**
     * 将字符串转换成map
     * @return
     */
    private Ini.Section getFilterChainDefinitions() {
        Ini ini = new Ini();
        ini.load(shiroProperties.getFilterChainDefinitions());
        Ini.Section section = ini.getSection("");
        section.put("*//**", section.remove("*//**"));
        return section;
    }
    @Bean
    @ConditionalOnMissingBean
    public net.sf.ehcache.CacheManager ehCacheCacheManager() {
        return EhCacheManagerUtils.buildCacheManager();
    }

    @Bean(name = "rsaServiceImpl")
    @ConditionalOnMissingBean
    public RSAService rsaServiceImpl(){
        return  new RSAServiceImpl();
    }

    @Bean(name="imageCaptchaService")
    @ConditionalOnMissingBean
    public DefaultManageableImageCaptchaService imageCaptchaService(){
        DefaultManageableImageCaptchaService   service=new DefaultManageableImageCaptchaService();
        service.setCaptchaEngine(new CaptchaEngine());
        service.setMinGuarantedStorageDelayInSeconds(3600);
        return  service;
    }
}
