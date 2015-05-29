/*    */ package com.hyxt.data.rbac.vo;
/*    */ 
/*    */ public abstract class BaseInfoVo extends BaseVo
/*    */ {
/*    */   protected String name;
/*    */   protected String shortName;
/*    */   protected boolean enable;
/*    */   private String spell;
/*    */   private String shortSpell;
/*    */   protected String remark;
/*    */ 
/*    */   public String getName()
/*    */   {
/* 39 */     return this.name;
/*    */   }
/*    */ 
/*    */   public void setName(String name) {
/* 43 */     this.name = name;
/*    */   }
/*    */ 
/*    */   public String getShortName() {
/* 47 */     return this.shortName;
/*    */   }
/*    */ 
/*    */   public void setShortName(String shortName) {
/* 51 */     this.shortName = shortName;
/*    */   }
/*    */ 
/*    */   public boolean isEnable() {
/* 55 */     return this.enable;
/*    */   }
/*    */ 
/*    */   public void setEnable(boolean enable) {
/* 59 */     this.enable = enable;
/*    */   }
/*    */ 
/*    */   public String getSpell() {
/* 63 */     return this.spell;
/*    */   }
/*    */ 
/*    */   public void setSpell(String spell) {
/* 67 */     this.spell = spell;
/*    */   }
/*    */ 
/*    */   public String getShortSpell() {
/* 71 */     return this.shortSpell;
/*    */   }
/*    */ 
/*    */   public void setShortSpell(String shortSpell) {
/* 75 */     this.shortSpell = shortSpell;
/*    */   }
/*    */ 
/*    */   public String getRemark() {
/* 79 */     return this.remark;
/*    */   }
/*    */ 
/*    */   public void setRemark(String remark) {
/* 83 */     this.remark = remark;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.BaseInfoVo
 * JD-Core Version:    0.6.0
 */