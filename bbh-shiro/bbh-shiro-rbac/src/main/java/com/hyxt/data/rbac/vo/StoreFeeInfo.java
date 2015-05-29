/*    */ package com.hyxt.data.rbac.vo;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class StoreFeeInfo
/*    */   implements Serializable
/*    */ {
/*    */   private Integer storeFee;
/*    */   private Integer storeCount;
/*    */ 
/*    */   public Integer getStoreFee()
/*    */   {
/* 21 */     return this.storeFee;
/*    */   }
/*    */ 
/*    */   public void setStoreFee(Integer storeFee) {
/* 25 */     this.storeFee = storeFee;
/*    */   }
/*    */ 
/*    */   public Integer getStoreCount() {
/* 29 */     return this.storeCount;
/*    */   }
/*    */ 
/*    */   public void setStoreCount(Integer storeCount) {
/* 33 */     this.storeCount = storeCount;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.StoreFeeInfo
 * JD-Core Version:    0.6.0
 */