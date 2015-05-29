/*     */ package com.hyxt.data.rbac.vo;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class StoreVo extends BaseInfoVo
/*     */ {
/*     */   private StoreVo parent;
/*     */   private ShopVo shop;
/*     */   private String type;
/*     */   private String code;
/*     */   private String circleId;
/*     */   private String circleName;
/*     */   private String longitude;
/*     */   private String latitude;
/*     */   private String phone;
/*     */   private String mobile;
/*     */   private String email;
/*     */   private String address;
/*     */   private String fax;
/*     */   private String contact;
/*     */   private String storeLevel;
/*     */   private String floorNo;
/*     */   private String shopNum;
/*     */   private Date startDay;
/*     */   private Date endDay;
/*     */   private String fullCircleId;
/*     */   private String fullCircleName;
/*     */   private String rat;
/*     */   private String provinceName;
/*     */   private String cityName;
/*     */   private String provinceId;
/*     */   private String cityId;
/*     */   private String storeLogo;
/*     */   private Long storeBranch;
/*     */   private String storeBranchIds;
/*     */   private String storeTel;
/*     */   private String memberNo;
/*     */   private String tlementInterval;
/*     */ 
/*     */   public String getMemberNo()
/*     */   {
/* 164 */     return this.memberNo;
/*     */   }
/*     */ 
/*     */   public void setMemberNo(String memberNo) {
/* 168 */     this.memberNo = memberNo;
/*     */   }
/*     */ 
/*     */   public String getTlementInterval() {
/* 172 */     return this.tlementInterval;
/*     */   }
/*     */ 
/*     */   public void setTlementInterval(String tlementInterval) {
/* 176 */     this.tlementInterval = tlementInterval;
/*     */   }
/*     */ 
/*     */   public ShopVo getShop()
/*     */   {
/* 181 */     if (this.shop != null) {
/* 182 */       this.shop.setShopFunctions(null);
/*     */     }
/* 184 */     return this.shop;
/*     */   }
/*     */ 
/*     */   public void setShop(ShopVo shop) {
/* 188 */     if (shop != null) {
/* 189 */       shop.setShopFunctions(null);
/*     */     }
/* 191 */     this.shop = shop;
/*     */   }
/*     */ 
/*     */   public String getStoreLevel() {
/* 195 */     return this.storeLevel;
/*     */   }
/*     */ 
/*     */   public void setStoreLevel(String storeLevel) {
/* 199 */     this.storeLevel = storeLevel;
/*     */   }
/*     */ 
/*     */   public String getFloorNo() {
/* 203 */     return this.floorNo;
/*     */   }
/*     */ 
/*     */   public void setFloorNo(String floorNo) {
/* 207 */     this.floorNo = floorNo;
/*     */   }
/*     */ 
/*     */   public String getShopNum() {
/* 211 */     return this.shopNum;
/*     */   }
/*     */ 
/*     */   public void setShopNum(String shopNum) {
/* 215 */     this.shopNum = shopNum;
/*     */   }
/*     */ 
/*     */   public Date getStartDay() {
/* 219 */     return this.startDay;
/*     */   }
/*     */ 
/*     */   public void setStartDay(Date startDay) {
/* 223 */     this.startDay = startDay;
/*     */   }
/*     */ 
/*     */   public Date getEndDay() {
/* 227 */     return this.endDay;
/*     */   }
/*     */ 
/*     */   public void setEndDay(Date endDay) {
/* 231 */     this.endDay = endDay;
/*     */   }
/*     */ 
/*     */   public String getRat() {
/* 235 */     return this.rat;
/*     */   }
/*     */ 
/*     */   public void setRat(String rat) {
/* 239 */     this.rat = rat;
/*     */   }
/*     */ 
/*     */   public String getType() {
/* 243 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(String type) {
/* 247 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public String getCode() {
/* 251 */     return this.code;
/*     */   }
/*     */ 
/*     */   public void setCode(String code) {
/* 255 */     this.code = code;
/*     */   }
/*     */ 
/*     */   public String getCircleId() {
/* 259 */     return this.circleId;
/*     */   }
/*     */ 
/*     */   public void setCircleId(String circleId) {
/* 263 */     this.circleId = circleId;
/*     */   }
/*     */ 
/*     */   public String getLongitude() {
/* 267 */     return this.longitude;
/*     */   }
/*     */ 
/*     */   public void setLongitude(String longitude) {
/* 271 */     this.longitude = longitude;
/*     */   }
/*     */ 
/*     */   public String getLatitude() {
/* 275 */     return this.latitude;
/*     */   }
/*     */ 
/*     */   public void setLatitude(String latitude) {
/* 279 */     this.latitude = latitude;
/*     */   }
/*     */ 
/*     */   public String getPhone() {
/* 283 */     return this.phone;
/*     */   }
/*     */ 
/*     */   public void setPhone(String phone) {
/* 287 */     this.phone = phone;
/*     */   }
/*     */ 
/*     */   public String getMobile() {
/* 291 */     return this.mobile;
/*     */   }
/*     */ 
/*     */   public void setMobile(String mobile) {
/* 295 */     this.mobile = mobile;
/*     */   }
/*     */ 
/*     */   public String getEmail() {
/* 299 */     return this.email;
/*     */   }
/*     */ 
/*     */   public void setEmail(String email) {
/* 303 */     this.email = email;
/*     */   }
/*     */ 
/*     */   public String getAddress() {
/* 307 */     return this.address;
/*     */   }
/*     */ 
/*     */   public void setAddress(String address) {
/* 311 */     this.address = address;
/*     */   }
/*     */ 
/*     */   public String getFax() {
/* 315 */     return this.fax;
/*     */   }
/*     */ 
/*     */   public void setFax(String fax) {
/* 319 */     this.fax = fax;
/*     */   }
/*     */ 
/*     */   public String getContact() {
/* 323 */     return this.contact;
/*     */   }
/*     */ 
/*     */   public void setContact(String contact) {
/* 327 */     this.contact = contact;
/*     */   }
/*     */ 
/*     */   public StoreVo getParent() {
/* 331 */     return this.parent;
/*     */   }
/*     */ 
/*     */   public void setParent(StoreVo parent) {
/* 335 */     this.parent = parent;
/*     */   }
/*     */ 
/*     */   public String getFullCircleId()
/*     */   {
/* 348 */     return this.fullCircleId;
/*     */   }
/*     */ 
/*     */   public void setFullCircleId(String fullCircleId) {
/* 352 */     this.fullCircleId = fullCircleId;
/*     */   }
/*     */ 
/*     */   public String getFullCircleName() {
/* 356 */     return this.fullCircleName;
/*     */   }
/*     */ 
/*     */   public void setFullCircleName(String fullCircleName) {
/* 360 */     this.fullCircleName = fullCircleName;
/*     */   }
/*     */ 
/*     */   public String getCircleName() {
/* 364 */     return this.circleName;
/*     */   }
/*     */ 
/*     */   public void setCircleName(String circleName) {
/* 368 */     this.circleName = circleName;
/*     */   }
/*     */ 
/*     */   public String getProvinceName() {
/* 372 */     return this.provinceName;
/*     */   }
/*     */ 
/*     */   public void setProvinceName(String provinceName) {
/* 376 */     this.provinceName = provinceName;
/*     */   }
/*     */ 
/*     */   public String getCityName() {
/* 380 */     return this.cityName;
/*     */   }
/*     */ 
/*     */   public void setCityName(String cityName) {
/* 384 */     this.cityName = cityName;
/*     */   }
/*     */ 
/*     */   public String getProvinceId() {
/* 388 */     return this.provinceId;
/*     */   }
/*     */ 
/*     */   public void setProvinceId(String provinceId) {
/* 392 */     this.provinceId = provinceId;
/*     */   }
/*     */ 
/*     */   public String getCityId() {
/* 396 */     return this.cityId;
/*     */   }
/*     */ 
/*     */   public void setCityId(String cityId) {
/* 400 */     this.cityId = cityId;
/*     */   }
/*     */ 
/*     */   public String getStoreLogo() {
/* 404 */     return this.storeLogo;
/*     */   }
/*     */ 
/*     */   public void setStoreLogo(String storeLogo) {
/* 408 */     this.storeLogo = storeLogo;
/*     */   }
/*     */ 
/*     */   public Long getStoreBranch() {
/* 412 */     return this.storeBranch;
/*     */   }
/*     */ 
/*     */   public void setStoreBranch(Long storeBranch) {
/* 416 */     this.storeBranch = storeBranch;
/*     */   }
/*     */ 
/*     */   public String getStoreBranchIds() {
/* 420 */     return this.storeBranchIds;
/*     */   }
/*     */ 
/*     */   public void setStoreBranchIds(String storeBranchIds) {
/* 424 */     this.storeBranchIds = storeBranchIds;
/*     */   }
/*     */ 
/*     */   public String getStoreTel() {
/* 428 */     return this.storeTel;
/*     */   }
/*     */ 
/*     */   public void setStoreTel(String storeTel) {
/* 432 */     this.storeTel = storeTel;
/*     */   }
/*     */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.StoreVo
 * JD-Core Version:    0.6.0
 */