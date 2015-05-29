/*    */ package com.hyxt.data.rbac.vo.page;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ public class SortVo
/*    */   implements Serializable
/*    */ {
/*    */   private List<Order> orders;
/*    */ 
/*    */   public SortVo(Order[] orders)
/*    */   {
/* 15 */     this(Arrays.asList(orders));
/*    */   }
/*    */ 
/*    */   public SortVo(List<Order> orders) {
/* 19 */     this.orders = orders;
/*    */   }
/*    */ 
/*    */   public List<Order> getOrders() {
/* 23 */     return this.orders;
/*    */   }
/*    */ 
/*    */   public void setOrders(List<Order> orders) {
/* 27 */     this.orders = orders;
/*    */   }
/*    */   public static class Order {
/*    */     private Direction direction;
/*    */     private String property;
/*    */ 
/*    */     public Order(Direction direction, String property) {
/* 36 */       this.direction = direction;
/* 37 */       this.property = property;
/*    */     }
/*    */ 
/*    */     public Direction getDirection() {
/* 41 */       return this.direction;
/*    */     }
/*    */ 
/*    */     public void setDirection(Direction direction) {
/* 45 */       this.direction = direction;
/*    */     }
/*    */ 
/*    */     public String getProperty() {
/* 49 */       return this.property;
/*    */     }
/*    */ 
/*    */     public void setProperty(String property) {
/* 53 */       this.property = property;
/*    */     }
/*    */ 
/*    */     public static enum Direction {
/* 57 */       ASC, DESC;
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.page.SortVo
 * JD-Core Version:    0.6.0
 */