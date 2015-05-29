/*    */ package com.hyxt.data.rbac.vo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ public class ShopAnnualVo extends BaseVo
/*    */ {
/*    */   private String shopId;
/*    */   private Date startTime;
/*    */   private Date endTime;
/*    */   private Integer accountFee;
/*    */ 
/*    */   public Date getStartTime()
/*    */   {
/* 28 */     return this.startTime;
/*    */   }
/*    */ 
/*    */   public void setStartTime(Date startTime) {
/* 32 */     this.startTime = startTime;
/*    */   }
/*    */ 
/*    */   public Date getEndTime() {
/* 36 */     return this.endTime;
/*    */   }
/*    */ 
/*    */   public void setEndTime(Date endTime) {
/* 40 */     this.endTime = endTime;
/*    */   }
/*    */ 
/*    */   public Integer getAccountFee() {
/* 44 */     return this.accountFee;
/*    */   }
/*    */ 
/*    */   public void setAccountFee(Integer accountFee) {
/* 48 */     this.accountFee = accountFee;
/*    */   }
/*    */ 
/*    */   public String getShopId() {
/* 52 */     return this.shopId;
/*    */   }
/*    */ 
/*    */   public void setShopId(String shopId) {
/* 56 */     this.shopId = shopId;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.ShopAnnualVo
 * JD-Core Version:    0.6.0
 */