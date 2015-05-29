/*    */ package com.hyxt.data.rbac.em;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonFormat;
/*    */ import com.fasterxml.jackson.annotation.JsonFormat.Shape;
/*    */ 
/*    */ @JsonFormat(shape=JsonFormat.Shape.OBJECT)
/*    */ public enum ResourceType
/*    */ {
/* 29 */   MENU("菜单"), 
/* 30 */   URL("URL"), 
/* 31 */   ELEMENT("元素"), 
/* 32 */   APP("应用");
/*    */ 
/*    */   private String value;
/*    */ 
/* 35 */   private ResourceType(String value) { this.value = value;
/*    */   }
/*    */ 
/*    */   public String getValue()
/*    */   {
/* 45 */     return this.value;
/*    */   }
/*    */ 
/*    */   public void setValue(String value) {
/* 49 */     this.value = value;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.em.ResourceType
 * JD-Core Version:    0.6.0
 */