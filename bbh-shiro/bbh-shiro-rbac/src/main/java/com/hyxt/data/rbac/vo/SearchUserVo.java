/*    */ package com.hyxt.data.rbac.vo;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ 
/*    */ public class SearchUserVo
/*    */   implements Serializable
/*    */ {
/*    */   private String shopId;
/*    */   private String storeId;
/*    */   private String userName;
/*    */   private String nickName;
/*    */   private Date startDate;
/*    */   private Date endDate;
/*    */   private Boolean isDelete;
/* 19 */   private int startIndex = 1;
/* 20 */   private int pageSize = 10;
/*    */ 
/*    */   public String getShopId() {
/* 23 */     return this.shopId;
/*    */   }
/*    */ 
/*    */   public void setShopId(String shopId) {
/* 27 */     this.shopId = shopId;
/*    */   }
/*    */ 
/*    */   public String getStoreId() {
/* 31 */     return this.storeId;
/*    */   }
/*    */ 
/*    */   public void setStoreId(String storeId) {
/* 35 */     this.storeId = storeId;
/*    */   }
/*    */ 
/*    */   public String getUserName() {
/* 39 */     return this.userName;
/*    */   }
/*    */ 
/*    */   public void setUserName(String userName) {
/* 43 */     this.userName = userName;
/*    */   }
/*    */ 
/*    */   public String getNickName() {
/* 47 */     return this.nickName;
/*    */   }
/*    */ 
/*    */   public void setNickName(String nickName) {
/* 51 */     this.nickName = nickName;
/*    */   }
/*    */ 
/*    */   public Date getStartDate() {
/* 55 */     return this.startDate;
/*    */   }
/*    */ 
/*    */   public void setStartDate(Date startDate) {
/* 59 */     this.startDate = startDate;
/*    */   }
/*    */ 
/*    */   public Date getEndDate() {
/* 63 */     return this.endDate;
/*    */   }
/*    */ 
/*    */   public void setEndDate(Date endDate) {
/* 67 */     this.endDate = endDate;
/*    */   }
/*    */ 
/*    */   public int getStartIndex() {
/* 71 */     return this.startIndex;
/*    */   }
/*    */ 
/*    */   public void setStartIndex(int startIndex) {
/* 75 */     this.startIndex = startIndex;
/*    */   }
/*    */ 
/*    */   public int getPageSize() {
/* 79 */     return this.pageSize;
/*    */   }
/*    */ 
/*    */   public void setPageSize(int pageSize) {
/* 83 */     this.pageSize = pageSize;
/*    */   }
/*    */ 
/*    */   public Boolean getIsDelete() {
/* 87 */     return this.isDelete;
/*    */   }
/*    */ 
/*    */   public void setIsDelete(Boolean isDelete) {
/* 91 */     this.isDelete = isDelete;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.SearchUserVo
 * JD-Core Version:    0.6.0
 */