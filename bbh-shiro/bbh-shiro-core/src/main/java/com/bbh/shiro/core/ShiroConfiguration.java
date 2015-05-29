 package com.bbh.shiro.core;
 
 import com.bbh.shiro.core.security.CasAuthRealm;
 import com.bbh.shiro.core.security.ChainDefinitionSectionMetaSource;
 import com.hyxt.data.rbac.service.AccountService;
 import java.util.EnumSet;

 import javax.servlet.DispatcherType;
 import org.apache.shiro.cache.ehcache.EhCacheManager;
 import org.apache.shiro.cas.CasFilter;
 import org.apache.shiro.cas.CasSubjectFactory;
 import org.apache.shiro.spring.LifecycleBeanPostProcessor;
 import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
 import org.apache.shiro.web.filter.authc.LogoutFilter;
 import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
 import org.jasig.cas.client.session.SingleSignOutFilter;
 import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
 import org.springframework.boot.context.embedded.FilterRegistrationBean;
 import org.springframework.boot.context.properties.EnableConfigurationProperties;
 import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.context.annotation.DependsOn;
 import org.springframework.web.filter.DelegatingFilterProxy;
 
 @Configuration
 @ConditionalOnExpression("${shiro.enable:true}")
 @EnableConfigurationProperties({ShiroSettings.class})
 public class ShiroConfiguration
 {
   @Bean
   public EhCacheManager ehCacheManager(EhCacheManagerFactoryBean ehCacheManagerFactoryBean)
   {
     EhCacheManager ehCacheManager = new EhCacheManager();
     ehCacheManager.setCacheManager(ehCacheManagerFactoryBean.getObject());
     return ehCacheManager;
   }
   @Bean
   @DependsOn({"lifecycleBeanPostProcessor"})
   public CasAuthRealm casRealm(ShiroSettings settings, AccountService accountService) { CasAuthRealm realm = new CasAuthRealm();
     realm.setAccountService(accountService);
     realm.setShiroSettings(settings);
     realm.setName("casAuthRealm");
 
     realm.setDefaultPermissionString(settings.getDefaultPermissionString());
 
     realm.setDefaultRoleString(settings.getDefaultRoleString());
 
     realm.setAuthorizationCachingEnabled(true);
     realm.setAuthorizationCacheName(settings.getAuthorizationCacheName());
 
     realm.setAuthenticationCachingEnabled(true);
 
     realm.setAuthenticationCacheName(settings.getAuthenticationCacheName());
 
     realm.setCasServerUrlPrefix(settings.getCasServerUrlPrefix());
     realm.setCasService(settings.getServiceUrl());
     return realm; }
 
   @Bean(name={"securityManager"})
   public DefaultWebSecurityManager defaultWebSecurityManager(CasAuthRealm casRealm, EhCacheManager ehCacheManager) {
     DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
     defaultWebSecurityManager.setRealm(casRealm);
     defaultWebSecurityManager.setCacheManager(ehCacheManager);
     return defaultWebSecurityManager;
   }
   @Bean(name={"chainDefinitionSectionMetaSource"})
   public ChainDefinitionSectionMetaSource chainDefinitionSectionMetaSource(ShiroSettings settings, AccountService accountService) {
     ChainDefinitionSectionMetaSource chainDefinitionSectionMetaSource = new ChainDefinitionSectionMetaSource();
     chainDefinitionSectionMetaSource.setAccountService(accountService);
     chainDefinitionSectionMetaSource.setShiroSettings(settings);
     chainDefinitionSectionMetaSource.setFilterChainDefinitions(settings.getFilterChainDefinitions());
     return chainDefinitionSectionMetaSource;
   }
   @Bean(name={"shiroFilter"})
   public ShiroFilterFactoryBean shiroFilterFactoryBean(CasFilter casFilter, ShiroSettings settings, DefaultWebSecurityManager defaultWebSecurityManager, ChainDefinitionSectionMetaSource chainDefinitionSectionMetaSource) throws ClassNotFoundException {
     ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
     factoryBean.getFilters().put("casAuthc", casFilter);
     LogoutFilter logoutFilter = new LogoutFilter();
     logoutFilter.setRedirectUrl(settings.getLogoutUrl());
     factoryBean.getFilters().put("logout", logoutFilter);
     factoryBean.setSecurityManager(defaultWebSecurityManager);
     factoryBean.setLoginUrl(settings.getLoginUrl());
     factoryBean.setSuccessUrl(settings.getSuccessUrl());
     factoryBean.setUnauthorizedUrl(settings.getUnauthorizedUrl());
     factoryBean.setFilterChainDefinitionMap(chainDefinitionSectionMetaSource.getObject());
     return factoryBean;
   }
   @Bean
   public CasFilter casFilter(ShiroSettings settings) {
     CasFilter casFilter = new CasFilter();
     casFilter.setFailureUrl(settings.getErrorUrl());
     return casFilter;
   }
 
   @Bean
   public CasSubjectFactory casSubjectFactory()
   {
     return new CasSubjectFactory();
   }
   @Bean
   public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
     return new LifecycleBeanPostProcessor();
   }
 
   @Bean
   public FilterRegistrationBean singleSignOutFilter() {
     FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
     filterRegBean.setFilter(new SingleSignOutFilter());
     filterRegBean.setOrder(-2147483647);
     return filterRegBean;
   }
   @Bean
   public FilterRegistrationBean authorizationFilter() { FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
     filterRegBean.setFilter(new DelegatingFilterProxy("shiroFilter"));
     filterRegBean.setOrder(-2147483647);
     filterRegBean.addInitParameter("targetFilterLifecycle", "true");
     filterRegBean.setDispatcherTypes(EnumSet.allOf(DispatcherType.class));
     return filterRegBean;
   }
 }
