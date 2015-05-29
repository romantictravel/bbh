/*    */ package com.hyxt.data.rbac.vo;
/*    */ 
/*    */ import com.hyxt.data.rbac.em.ShopFn;
/*    */ 
/*    */ public class ShopFunctionVo extends BaseVo
/*    */ {
/*    */   private String annualId;
/*    */   private ShopFn shopFn;
/*    */ 
/*    */   public ShopFn getShopFn()
/*    */   {
/* 15 */     return this.shopFn;
/*    */   }
/*    */ 
/*    */   public void setShopFn(ShopFn shopFn) {
/* 19 */     this.shopFn = shopFn;
/*    */   }
/*    */ 
/*    */   public String getAnnualId() {
/* 23 */     return this.annualId;
/*    */   }
/*    */ 
/*    */   public void setAnnualId(String annualId) {
/* 27 */     this.annualId = annualId;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.ShopFunctionVo
 * JD-Core Version:    0.6.0
 */