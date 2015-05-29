/*    */ package com.hyxt.data.rbac.vo;
/*    */ 
/*    */ import com.hyxt.data.rbac.em.RoleType;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class RoleVo extends BaseInfoVo
/*    */ {
/*    */   private String specialRoleName;
/*    */   private String shopId;
/*    */   private RoleType type;
/*    */   private String value;
/* 33 */   private List<ResourceVo> resources = new ArrayList();
/*    */ 
/*    */   public String getValue() {
/* 36 */     return this.value;
/*    */   }
/*    */ 
/*    */   public void setValue(String value) {
/* 40 */     this.value = value;
/*    */   }
/*    */ 
/*    */   public List<ResourceVo> getResources() {
/* 44 */     return this.resources;
/*    */   }
/*    */ 
/*    */   public void setResources(List<ResourceVo> resources) {
/* 48 */     this.resources = resources;
/*    */   }
/*    */ 
/*    */   public RoleType getType() {
/* 52 */     return this.type;
/*    */   }
/*    */ 
/*    */   public void setType(RoleType type) {
/* 56 */     this.type = type;
/*    */   }
/*    */ 
/*    */   public String getShopId() {
/* 60 */     return this.shopId;
/*    */   }
/*    */ 
/*    */   public void setShopId(String shopId) {
/* 64 */     this.shopId = shopId;
/*    */   }
/*    */ 
/*    */   public String getSpecialRoleName() {
/* 68 */     return this.specialRoleName;
/*    */   }
/*    */ 
/*    */   public void setSpecialRoleName(String specialRoleName) {
/* 72 */     this.specialRoleName = specialRoleName;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.RoleVo
 * JD-Core Version:    0.6.0
 */