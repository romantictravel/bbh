/*    */ package com.hyxt.data.rbac.vo;
/*    */ 
/*    */ public class DeviceInfoVo extends BaseInfoVo
/*    */ {
/*    */   private StoreVo store;
/*    */   private ShopInfo shop;
/*    */   private String code;
/*    */   private String flag;
/*    */   private String passCode;
/*    */   private String oldPosNo;
/*    */ 
/*    */   public String getOldPosNo()
/*    */   {
/* 23 */     return this.oldPosNo;
/*    */   }
/*    */ 
/*    */   public void setOldPosNo(String oldPosNo) {
/* 27 */     this.oldPosNo = oldPosNo;
/*    */   }
/*    */ 
/*    */   public String getFlag() {
/* 31 */     return this.flag;
/*    */   }
/*    */ 
/*    */   public void setFlag(String flag) {
/* 35 */     this.flag = flag;
/*    */   }
/*    */ 
/*    */   public StoreVo getStore() {
/* 39 */     return this.store;
/*    */   }
/*    */ 
/*    */   public void setStore(StoreVo store) {
/* 43 */     this.store = store;
/*    */   }
/*    */ 
/*    */   public String getCode() {
/* 47 */     return this.code;
/*    */   }
/*    */ 
/*    */   public void setCode(String code) {
/* 51 */     this.code = code;
/*    */   }
/*    */ 
/*    */   public ShopInfo getShop() {
/* 55 */     return this.shop;
/*    */   }
/*    */ 
/*    */   public void setShop(ShopInfo shop) {
/* 59 */     this.shop = shop;
/*    */   }
/*    */ 
/*    */   public String getPassCode() {
/* 63 */     return this.passCode;
/*    */   }
/*    */ 
/*    */   public void setPassCode(String passCode) {
/* 67 */     this.passCode = passCode;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.DeviceInfoVo
 * JD-Core Version:    0.6.0
 */