/*    */ package com.hyxt.data.rbac.vo.page;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ 
/*    */ public class PageVo<T>
/*    */   implements Serializable
/*    */ {
/*    */   private int page;
/*    */   private int size;
/*    */   private long total;
/*    */   private List<T> content;
/*    */   private SortVo sort;
/*    */ 
/*    */   public int getTotalPages()
/*    */   {
/* 32 */     return getSize() == 0 ? 1 : (int)Math.ceil(this.total / getSize());
/*    */   }
/*    */ 
/*    */   public int getPage() {
/* 36 */     return this.page;
/*    */   }
/*    */ 
/*    */   public void setPage(int page) {
/* 40 */     this.page = page;
/*    */   }
/*    */ 
/*    */   public int getSize() {
/* 44 */     return this.size;
/*    */   }
/*    */ 
/*    */   public void setSize(int size) {
/* 48 */     this.size = size;
/*    */   }
/*    */ 
/*    */   public long getTotal() {
/* 52 */     return this.total;
/*    */   }
/*    */ 
/*    */   public void setTotal(long total) {
/* 56 */     this.total = total;
/*    */   }
/*    */ 
/*    */   public List<T> getContent() {
/* 60 */     return this.content;
/*    */   }
/*    */ 
/*    */   public void setContent(List<T> content) {
/* 64 */     this.content = content;
/*    */   }
/*    */ 
/*    */   public SortVo getSort() {
/* 68 */     return this.sort;
/*    */   }
/*    */ 
/*    */   public void setSort(SortVo sort) {
/* 72 */     this.sort = sort;
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.page.PageVo
 * JD-Core Version:    0.6.0
 */