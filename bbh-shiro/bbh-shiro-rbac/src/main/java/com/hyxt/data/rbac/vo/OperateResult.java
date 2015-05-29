/*    */ package com.hyxt.data.rbac.vo;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class OperateResult
/*    */   implements Serializable
/*    */ {
/* 22 */   private boolean success = true;
/* 23 */   private String messsage = "操作成功";
/*    */ 
/*    */   public OperateResult()
/*    */   {
/*    */   }
/*    */ 
/*    */   public OperateResult(String message)
/*    */   {
/* 14 */     this(false, message);
/*    */   }
/*    */ 
/*    */   public OperateResult(boolean success, String message) {
/* 18 */     this.success = success;
/* 19 */     this.messsage = message;
/*    */   }
/*    */ 
/*    */   public boolean getSuccess()
/*    */   {
/* 26 */     return this.success;
/*    */   }
/*    */ 
/*    */   public void setSuccess(boolean success) {
/* 30 */     this.success = success;
/*    */   }
/*    */ 
/*    */   public String getMesssage() {
/* 34 */     return this.messsage;
/*    */   }
/*    */ 
/*    */   public void setMesssage(String messsage) {
/* 38 */     this.messsage = messsage;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.OperateResult
 * JD-Core Version:    0.6.0
 */