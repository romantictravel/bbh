/*    */ package com.hyxt.data.rbac.vo.page;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class PageableVo
/*    */   implements Serializable
/*    */ {
/*    */   private int page;
/*    */   private int size;
/*    */   private SortVo sort;
/*    */ 
/*    */   public PageableVo(int page, int size)
/*    */   {
/* 23 */     this.page = page;
/* 24 */     this.size = size;
/*    */   }
/*    */ 
/*    */   public PageableVo(int page, int size, SortVo sort) {
/* 28 */     this.page = page;
/* 29 */     this.size = size;
/* 30 */     this.sort = sort;
/*    */   }
/*    */ 
/*    */   public int getPage() {
/* 34 */     return this.page;
/*    */   }
/*    */ 
/*    */   public void setPage(int page) {
/* 38 */     this.page = page;
/*    */   }
/*    */ 
/*    */   public int getSize() {
/* 42 */     return this.size;
/*    */   }
/*    */ 
/*    */   public void setSize(int size) {
/* 46 */     this.size = size;
/*    */   }
/*    */ 
/*    */   public SortVo getSort() {
/* 50 */     return this.sort;
/*    */   }
/*    */ 
/*    */   public void setSort(SortVo sort) {
/* 54 */     this.sort = sort;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.page.PageableVo
 * JD-Core Version:    0.6.0
 */