/*    */ package com.hyxt.data.rbac.em;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonFormat;
/*    */ import com.fasterxml.jackson.annotation.JsonFormat.Shape;
/*    */ 
/*    */ @JsonFormat(shape=JsonFormat.Shape.OBJECT)
/*    */ public enum ShopFn
/*    */ {
/* 10 */   MAIN("主平台"), 
/* 11 */   WX("微信支付"), 
/* 12 */   INTERACTION("互动终端"), 
/* 13 */   WIFI_TERMINAL("wifi"), 
/* 14 */   DATA_BOX("数据盒子"), 
/* 15 */   INTELLIGENCE_TICKET("智慧会务");
/*    */ 
/*    */   private final String text;
/*    */ 
/* 18 */   private ShopFn(String text) { this.text = text;
/*    */   }
/*    */ 
/*    */   public String getText()
/*    */   {
/* 24 */     return this.text;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.em.ShopFn
 * JD-Core Version:    0.6.0
 */