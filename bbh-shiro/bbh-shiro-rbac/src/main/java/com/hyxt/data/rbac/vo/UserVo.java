/*     */ package com.hyxt.data.rbac.vo;
/*     */ 
/*     */ import com.hyxt.data.rbac.em.Gender;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ 
/*     */ public class UserVo extends BaseInfoVo
/*     */ {
/*     */   private ShopVo shop;
/*     */   private List<StoreVo> stores;
/*  26 */   private List<RoleVo> roles = new ArrayList();
/*     */   private String address;
/*     */   private String password;
/*     */   private String email;
/*     */   private Date birthDay;
/*  51 */   private boolean isLunarCalendar = false;
/*     */   private String mobile;
/*     */   private String workTel;
/*     */   private String familyTel;
/*     */   private String fax;
/*  77 */   private Gender gender = Gender.MALE;
/*     */   private Boolean active;
/*     */   private String portrait;
/*     */   private Boolean isDelete;
/*     */ 
/*     */   public ShopVo getShop()
/*     */   {
/*  90 */     if (this.shop != null) {
/*  91 */       this.shop.setShopFunctions(null);
/*     */     }
/*  93 */     return this.shop;
/*     */   }
/*     */ 
/*     */   public void setShop(ShopVo shop) {
/*  97 */     if (shop != null) {
/*  98 */       shop.setShopFunctions(null);
/*     */     }
/* 100 */     this.shop = shop;
/*     */   }
/*     */ 
/*     */   public List<StoreVo> getStores() {
/* 104 */     return this.stores;
/*     */   }
/*     */ 
/*     */   public void setStores(List<StoreVo> stores) {
/* 108 */     this.stores = stores;
/*     */   }
/*     */ 
/*     */   public List<RoleVo> getRoles() {
/* 112 */     return this.roles;
/*     */   }
/*     */ 
/*     */   public void setRoles(List<RoleVo> roles) {
/* 116 */     this.roles = roles;
/*     */   }
/*     */ 
/*     */   public String getAddress() {
/* 120 */     return this.address;
/*     */   }
/*     */ 
/*     */   public void setAddress(String address) {
/* 124 */     this.address = address;
/*     */   }
/*     */ 
/*     */   public String getPassword() {
/* 128 */     return this.password;
/*     */   }
/*     */ 
/*     */   public void setPassword(String password) {
/* 132 */     this.password = password;
/*     */   }
/*     */ 
/*     */   public String getEmail() {
/* 136 */     return this.email;
/*     */   }
/*     */ 
/*     */   public void setEmail(String email) {
/* 140 */     this.email = email;
/*     */   }
/*     */ 
/*     */   public Date getBirthDay() {
/* 144 */     return this.birthDay;
/*     */   }
/*     */ 
/*     */   public void setBirthDay(Date birthDay) {
/* 148 */     this.birthDay = birthDay;
/*     */   }
/*     */ 
/*     */   public boolean isLunarCalendar() {
/* 152 */     return this.isLunarCalendar;
/*     */   }
/*     */ 
/*     */   public void setLunarCalendar(boolean isLunarCalendar) {
/* 156 */     this.isLunarCalendar = isLunarCalendar;
/*     */   }
/*     */ 
/*     */   public String getMobile() {
/* 160 */     return this.mobile;
/*     */   }
/*     */ 
/*     */   public void setMobile(String mobile) {
/* 164 */     this.mobile = mobile;
/*     */   }
/*     */ 
/*     */   public String getWorkTel() {
/* 168 */     return this.workTel;
/*     */   }
/*     */ 
/*     */   public void setWorkTel(String workTel) {
/* 172 */     this.workTel = workTel;
/*     */   }
/*     */ 
/*     */   public String getFamilyTel() {
/* 176 */     return this.familyTel;
/*     */   }
/*     */ 
/*     */   public void setFamilyTel(String familyTel) {
/* 180 */     this.familyTel = familyTel;
/*     */   }
/*     */ 
/*     */   public String getFax() {
/* 184 */     return this.fax;
/*     */   }
/*     */ 
/*     */   public void setFax(String fax) {
/* 188 */     this.fax = fax;
/*     */   }
/*     */ 
/*     */   public Gender getGender() {
/* 192 */     return this.gender;
/*     */   }
/*     */ 
/*     */   public void setGender(Gender gender) {
/* 196 */     this.gender = gender;
/*     */   }
/*     */ 
/*     */   public String getPortrait() {
/* 200 */     return this.portrait;
/*     */   }
/*     */ 
/*     */   public void setPortrait(String portrait) {
/* 204 */     this.portrait = portrait;
/*     */   }
/*     */ 
/*     */   public Boolean getIsDelete() {
/* 208 */     return this.isDelete;
/*     */   }
/*     */ 
/*     */   public void setIsDelete(Boolean isDelete) {
/* 212 */     this.isDelete = isDelete;
/*     */   }
/*     */ 
/*     */   public Boolean getActive() {
/* 216 */     return this.active;
/*     */   }
/*     */ 
/*     */   public void setActive(Boolean active) {
/* 220 */     this.active = active;
/*     */   }
/*     */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.UserVo
 * JD-Core Version:    0.6.0
 */