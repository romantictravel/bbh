/*    */ package com.hyxt.data.rbac.vo;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class UserRoleSearch
/*    */   implements Serializable
/*    */ {
/*    */   private String userId;
/*    */   private String userName;
/*    */   private String shopId;
/*    */   private String[] roleIds;
/*    */ 
/*    */   public String getUserName()
/*    */   {
/* 15 */     return this.userName;
/*    */   }
/*    */ 
/*    */   public void setUserName(String userName) {
/* 19 */     this.userName = userName;
/*    */   }
/*    */ 
/*    */   public String getShopId() {
/* 23 */     return this.shopId;
/*    */   }
/*    */ 
/*    */   public void setShopId(String shopId) {
/* 27 */     this.shopId = shopId;
/*    */   }
/*    */ 
/*    */   public String[] getRoleIds() {
/* 31 */     return this.roleIds;
/*    */   }
/*    */ 
/*    */   public void setRoleIds(String[] roleIds) {
/* 35 */     this.roleIds = roleIds;
/*    */   }
/*    */ 
/*    */   public String getUserId() {
/* 39 */     return this.userId;
/*    */   }
/*    */ 
/*    */   public void setUserId(String userId) {
/* 43 */     this.userId = userId;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.UserRoleSearch
 * JD-Core Version:    0.6.0
 */