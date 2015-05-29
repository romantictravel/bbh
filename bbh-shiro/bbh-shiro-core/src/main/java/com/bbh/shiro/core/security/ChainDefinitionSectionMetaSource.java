/*    */ package com.bbh.shiro.core.security;
/*    */ 
/*    */ import com.bbh.shiro.core.ShiroSettings;
/*    */ import com.hyxt.data.rbac.service.AccountService;
/*    */ import com.hyxt.data.rbac.vo.ResourceVo;
/*    */ import com.hyxt.data.rbac.vo.RoleVo;
/*    */ import java.util.List;
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ import org.apache.shiro.config.Ini;
/*    */ import org.apache.shiro.config.Ini.Section;
/*    */ import org.springframework.beans.BeansException;
/*    */ import org.springframework.beans.factory.FactoryBean;
/*    */ 
/*    */ public class ChainDefinitionSectionMetaSource
/*    */   implements FactoryBean<Section>
/*    */ {
/*    */   private AccountService accountService;
/*    */   private ShiroSettings shiroSettings;
/*    */   private String filterChainDefinitions;
/*    */ 
/*    */   public void setAccountService(AccountService accountService)
/*    */   {
/* 29 */     this.accountService = accountService;
/*    */   }
/*    */ 
/*    */   public void setShiroSettings(ShiroSettings shiroSettings) {
/* 33 */     this.shiroSettings = shiroSettings;
/*    */   }
/*    */ 
/*    */   public void setFilterChainDefinitions(String filterChainDefinitions)
/*    */   {
/* 46 */     this.filterChainDefinitions = filterChainDefinitions;
/*    */   }
/*    */ 
/*    */   public Section getObject() throws BeansException
/*    */   {
/* 51 */     Ini ini = new Ini();
/*    */ 
/* 53 */     ini.load(this.filterChainDefinitions);
/* 54 */     Section section = ini.getSection("");
/*    */ 
/* 56 */     List resourceList = this.accountService.findResourcesByAppCode(this.shiroSettings.getAppCode());
/*    */ 
/* 58 */     for (ResourceVo resource : resourceList) {
/* 59 */       if ((StringUtils.isNotEmpty(resource.getValue())) && (StringUtils.isNotEmpty(resource.getPermission())))
/*    */       {
/* 61 */         section.put(resource.getValue(), resource.getPermission());
/*    */       }
/*    */ 
/*    */     }
/*    */ 
/* 66 */     for (RoleVo role : this.accountService.findAllRoles()) {
/* 67 */       if ((StringUtils.isNotEmpty(role.getValue())) && (StringUtils.isNotEmpty(role.getName())))
/*    */       {
/* 69 */         section.put(role.getValue(), "roles[" + role.getName() + "]");
/*    */       }
/*    */ 
/*    */     }
/*    */ 
/* 74 */     section.put("/**", section.remove("/**"));
/*    */ 
/* 76 */     return section;
/*    */   }
/*    */ 
/*    */   public Class<?> getObjectType()
/*    */   {
/* 81 */     return Section.class;
/*    */   }
/*    */ 
/*    */   public boolean isSingleton()
/*    */   {
/* 86 */     return true;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-shiro\5.9.0-SNAPSHOT\rbac-shiro-5.9.0-20150324.071746-1.jar
 * Qualified Name:     ChainDefinitionSectionMetaSource
 * JD-Core Version:    0.6.0
 */