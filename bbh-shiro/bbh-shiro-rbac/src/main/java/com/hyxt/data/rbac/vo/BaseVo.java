/*    */ package com.hyxt.data.rbac.vo;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ 
/*    */ public abstract class BaseVo
/*    */   implements Serializable
/*    */ {
/*    */   protected String id;
/*    */   protected String creatorUserId;
/*    */   protected String auditUserId;
/* 20 */   protected Date createDate = null;
/*    */   protected Date auditDate;
/* 26 */   protected boolean deleteStatus = Boolean.FALSE.booleanValue();
/*    */ 
/* 30 */   protected Long sort = Long.valueOf(0L);
/*    */ 
/*    */   public String getId() {
/* 33 */     return this.id;
/*    */   }
/*    */ 
/*    */   public void setId(String id) {
/* 37 */     this.id = id;
/*    */   }
/*    */ 
/*    */   public String getCreatorUserId() {
/* 41 */     return this.creatorUserId;
/*    */   }
/*    */ 
/*    */   public void setCreatorUserId(String creatorUserId) {
/* 45 */     this.creatorUserId = creatorUserId;
/*    */   }
/*    */ 
/*    */   public String getAuditUserId() {
/* 49 */     return this.auditUserId;
/*    */   }
/*    */ 
/*    */   public void setAuditUserId(String auditUserId) {
/* 53 */     this.auditUserId = auditUserId;
/*    */   }
/*    */ 
/*    */   public Date getCreateDate() {
/* 57 */     return this.createDate;
/*    */   }
/*    */ 
/*    */   public void setCreateDate(Date createDate) {
/* 61 */     this.createDate = createDate;
/*    */   }
/*    */ 
/*    */   public Date getAuditDate() {
/* 65 */     return this.auditDate;
/*    */   }
/*    */ 
/*    */   public void setAuditDate(Date auditDate) {
/* 69 */     this.auditDate = auditDate;
/*    */   }
/*    */ 
/*    */   public boolean isDeleteStatus() {
/* 73 */     return this.deleteStatus;
/*    */   }
/*    */ 
/*    */   public void setDeleteStatus(boolean deleteStatus) {
/* 77 */     this.deleteStatus = deleteStatus;
/*    */   }
/*    */ 
/*    */   public Long getSort() {
/* 81 */     return this.sort;
/*    */   }
/*    */ 
/*    */   public void setSort(Long sort) {
/* 85 */     this.sort = sort;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.BaseVo
 * JD-Core Version:    0.6.0
 */