/*    */ package com.hyxt.data.rbac.em;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonFormat;
/*    */ import com.fasterxml.jackson.annotation.JsonFormat.Shape;
/*    */ 
/*    */ @JsonFormat(shape=JsonFormat.Shape.OBJECT)
/*    */ public enum RoleType
/*    */ {
/* 11 */   SYSTEM("系统"), 
/* 12 */   SHOP("商家");
/*    */ 
/*    */   private String value;
/*    */ 
/* 17 */   private RoleType(String value) { this.value = value; }
/*    */ 
/*    */   public String getValue()
/*    */   {
/* 21 */     return this.value;
/*    */   }
/*    */ 
/*    */   public void setValue(String value) {
/* 25 */     this.value = value;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.em.RoleType
 * JD-Core Version:    0.6.0
 */