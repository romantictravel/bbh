/*    */ package com.hyxt.data.rbac.em;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonFormat;
/*    */ import com.fasterxml.jackson.annotation.JsonFormat.Shape;
/*    */ 
/*    */ @JsonFormat(shape=JsonFormat.Shape.OBJECT)
/*    */ public enum SupplyType
/*    */ {
/* 10 */   DIRECT("直销"), AGENT("代理商");
/*    */ 
/*    */   private final String name;
/*    */ 
/* 15 */   private SupplyType(String name) { this.name = name; }
/*    */ 
/*    */   public String getName()
/*    */   {
/* 19 */     return this.name;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.em.SupplyType
 * JD-Core Version:    0.6.0
 */