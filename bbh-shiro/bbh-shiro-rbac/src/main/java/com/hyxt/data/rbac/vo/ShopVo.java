/*     */ package com.hyxt.data.rbac.vo;
/*     */ 
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.GregorianCalendar;
/*     */ import java.util.List;
/*     */ 
/*     */ public class ShopVo extends ShopInfo
/*     */ {
/*     */   private Integer accountBalance;
/*     */   private Integer storeCount;
/*     */   private List<ShopFunctionVo> shopFunctions;
/*     */   private List<ShopFunctionView> shopFunctionViews;
/*     */   private List<ShopAnnualVo> annualList;
/*     */   private Integer storeFee;
/*     */   private SupplierVo supply;
/*     */ 
/*     */   public boolean getValid()
/*     */   {
/*  18 */     if ((!isEnable()) || (isDeleteStatus() == true)) {
/*  19 */       return false;
/*     */     }
/*  21 */     if ((getEndTime() == null) || (getStartTime() == null)) {
/*  22 */       return false;
/*     */     }
/*  24 */     Date now = new Date();
/*  25 */     Calendar calendar = new GregorianCalendar();
/*  26 */     calendar.setTime(getEndTime());
/*  27 */     calendar.add(5, 1);
/*     */ 
/*  29 */     return (now.getTime() >= getStartTime().getTime()) && (now.getTime() < calendar.getTime().getTime());
/*     */   }
/*     */ 
/*     */   public Date getStartTime()
/*     */   {
/*  60 */     return getDisplayPeriod().getStartTime();
/*     */   }
/*     */ 
/*     */   public Date getEndTime() {
/*  64 */     return getDisplayPeriod().getEndTime();
/*     */   }
/*     */ 
/*     */   private ShopAnnualVo getDisplayPeriod() {
/*  68 */     ShopAnnualVo shopAnnualVo = new ShopAnnualVo();
/*  69 */     if ((this.annualList != null) && (this.annualList.size() != 0)) {
/*  70 */       Date s = ((ShopAnnualVo)this.annualList.get(0)).getStartTime();
/*  71 */       Date e = ((ShopAnnualVo)this.annualList.get(0)).getEndTime();
/*  72 */       for (ShopAnnualVo annualVo : this.annualList) {
/*  73 */         if ((annualVo.getStartTime() == null) || (annualVo.getEndTime() == null)) {
/*  74 */           return shopAnnualVo;
/*     */         }
/*  76 */         Calendar calendar = new GregorianCalendar();
/*  77 */         calendar.setTime(e);
/*  78 */         calendar.add(5, 1);
/*  79 */         if (calendar.getTime().compareTo(annualVo.getStartTime()) == 0) {
/*  80 */           e = annualVo.getEndTime();
/*     */         } else {
/*  82 */           s = annualVo.getStartTime();
/*  83 */           e = annualVo.getEndTime();
/*     */         }
/*     */       }
/*  86 */       shopAnnualVo.setStartTime(s);
/*  87 */       shopAnnualVo.setEndTime(e);
/*  88 */       return shopAnnualVo;
/*     */     }
/*  90 */     return shopAnnualVo;
/*     */   }
/*     */ 
/*     */   public Date getRenewStart()
/*     */   {
/*  98 */     if ((this.annualList != null) && (this.annualList.size() != 0)) {
/*  99 */       Date date = getDisplayPeriod().getEndTime();
/* 100 */       if (date == null) {
/* 101 */         return new Date();
/*     */       }
/* 103 */       for (ShopAnnualVo shopAnnualVo : this.annualList) {
/* 104 */         if (shopAnnualVo.getEndTime().getTime() > date.getTime()) {
/* 105 */           date = shopAnnualVo.getEndTime();
/*     */         }
/*     */       }
/* 108 */       if (date.before(new Date())) {
/* 109 */         date = new Date();
/*     */       } else {
/* 111 */         Calendar calendar = new GregorianCalendar();
/* 112 */         calendar.setTime(date);
/* 113 */         calendar.add(5, 1);
/* 114 */         date = calendar.getTime();
/*     */       }
/* 116 */       return date;
/*     */     }
/* 118 */     return null;
/*     */   }
/*     */ 
/*     */   public Integer getStoreFee()
/*     */   {
/* 132 */     return this.storeFee;
/*     */   }
/*     */ 
/*     */   public void setStoreFee(Integer storeFee) {
/* 136 */     this.storeFee = storeFee;
/*     */   }
/*     */ 
/*     */   public List<ShopAnnualVo> getAnnualList() {
/* 140 */     return this.annualList;
/*     */   }
/*     */ 
/*     */   public void setAnnualList(List<ShopAnnualVo> annualList) {
/* 144 */     this.annualList = annualList;
/*     */   }
/*     */ 
/*     */   public List<ShopFunctionVo> getShopFunctions() {
/* 148 */     return this.shopFunctions;
/*     */   }
/*     */ 
/*     */   public void setShopFunctions(List<ShopFunctionVo> shopFunctions) {
/* 152 */     this.shopFunctions = shopFunctions;
/*     */   }
/*     */ 
/*     */   public Integer getStoreCount() {
/* 156 */     return this.storeCount;
/*     */   }
/*     */ 
/*     */   public void setStoreCount(Integer storeCount) {
/* 160 */     this.storeCount = storeCount;
/*     */   }
/*     */ 
/*     */   public Integer getAccountBalance() {
/* 164 */     return this.accountBalance;
/*     */   }
/*     */ 
/*     */   public void setAccountBalance(Integer accountBalance) {
/* 168 */     this.accountBalance = accountBalance;
/*     */   }
/*     */ 
/*     */   public SupplierVo getSupply() {
/* 172 */     return this.supply;
/*     */   }
/*     */ 
/*     */   public void setSupply(SupplierVo supply) {
/* 176 */     this.supply = supply;
/*     */   }
/*     */ 
/*     */   public List<ShopFunctionView> getShopFunctionViews() {
/* 180 */     return this.shopFunctionViews;
/*     */   }
/*     */ 
/*     */   public void setShopFunctionViews(List<ShopFunctionView> shopFunctionViews) {
/* 184 */     this.shopFunctionViews = shopFunctionViews;
/*     */   }
/*     */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.ShopVo
 * JD-Core Version:    0.6.0
 */