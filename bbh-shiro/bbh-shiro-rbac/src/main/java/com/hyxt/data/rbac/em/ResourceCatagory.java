/*    */ package com.hyxt.data.rbac.em;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonFormat;
/*    */ import com.fasterxml.jackson.annotation.JsonFormat.Shape;
/*    */ 
/*    */ @JsonFormat(shape=JsonFormat.Shape.OBJECT)
/*    */ public enum ResourceCatagory
/*    */ {
/* 11 */   PLATFORM("平台资源"), 
/* 12 */   MERCHANT("商家资源");
/*    */ 
/*    */   private final String text;
/*    */ 
/* 17 */   private ResourceCatagory(String text) { this.text = text; }
/*    */ 
/*    */   public String getText()
/*    */   {
/* 21 */     return this.text;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.em.ResourceCatagory
 * JD-Core Version:    0.6.0
 */