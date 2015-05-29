/*    */ package com.hyxt.data.rbac.em;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonFormat;
/*    */ import com.fasterxml.jackson.annotation.JsonFormat.Shape;
/*    */ 
/*    */ @JsonFormat(shape=JsonFormat.Shape.OBJECT)
/*    */ public enum SpecialRole
/*    */ {
/* 10 */   PLATFORM_ADMIN("系统角色"), 
/* 11 */   MERCHANT_ADMIN("商家管理员"), 
/* 12 */   REFUND_AUTH_ROLE("退款角色"), 
/*    */ 
/* 14 */   WX_MERC_ADMIN("微信支付商家管理员"), 
/* 15 */   WX_ACCEPT_ADMIN("微信支付受理商户管理员"), 
/* 16 */   WX_STORE_ADMIN("微信支付门店管理员"), 
/* 17 */   WX_PAY_ADMIN("微信支付操作员");
/*    */ 
/*    */   private final String text;
/*    */ 
/* 21 */   private SpecialRole(String text) { this.text = text; }
/*    */ 
/*    */   public String getText()
/*    */   {
/* 25 */     return this.text;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.em.SpecialRole
 * JD-Core Version:    0.6.0
 */