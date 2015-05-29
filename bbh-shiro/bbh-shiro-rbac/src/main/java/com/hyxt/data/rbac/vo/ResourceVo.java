/*     */ package com.hyxt.data.rbac.vo;
/*     */ 
/*     */ import com.hyxt.data.rbac.em.ResourceCatagory;
/*     */ import com.hyxt.data.rbac.em.ResourceType;
/*     */ import java.util.List;
/*     */ 
/*     */ public class ResourceVo extends BaseInfoVo
/*     */ {
/*     */   private ResourceCatagory resourceCatagory;
/*     */   private String appCode;
/*     */   private ResourceVo parent;
/*     */   private String permission;
/*     */   private String value;
/*     */   private String icon;
/*     */   private String url;
/*     */   private ResourceType type;
/*     */   private List<ResourceVo> children;
/*  39 */   private boolean deleteStatus = Boolean.FALSE.booleanValue();
/*  40 */   protected boolean enable = true;
/*     */   private String identifier;
/*     */ 
/*     */   public String getPermission()
/*     */   {
/*  48 */     return this.permission;
/*     */   }
/*     */ 
/*     */   public void setPermission(String permission) {
/*  52 */     this.permission = permission;
/*     */   }
/*     */ 
/*     */   public String getValue() {
/*  56 */     return this.value;
/*     */   }
/*     */ 
/*     */   public void setValue(String value) {
/*  60 */     this.value = value;
/*     */   }
/*     */ 
/*     */   public String getIcon() {
/*  64 */     return this.icon;
/*     */   }
/*     */ 
/*     */   public void setIcon(String icon) {
/*  68 */     this.icon = icon;
/*     */   }
/*     */ 
/*     */   public String getUrl() {
/*  72 */     return this.url;
/*     */   }
/*     */ 
/*     */   public void setUrl(String url) {
/*  76 */     this.url = url;
/*     */   }
/*     */ 
/*     */   public ResourceType getType() {
/*  80 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(ResourceType type) {
/*  84 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public List<ResourceVo> getChildren() {
/*  88 */     return this.children;
/*     */   }
/*     */ 
/*     */   public void setChildren(List<ResourceVo> children) {
/*  92 */     this.children = children;
/*     */   }
/*     */ 
/*     */   public ResourceVo getParent() {
/*  96 */     return this.parent;
/*     */   }
/*     */ 
/*     */   public void setParent(ResourceVo parent) {
/* 100 */     this.parent = parent;
/*     */   }
/*     */ 
/*     */   public String getAppCode() {
/* 104 */     return this.appCode;
/*     */   }
/*     */ 
/*     */   public void setAppCode(String appCode) {
/* 108 */     this.appCode = appCode;
/*     */   }
/*     */ 
/*     */   public ResourceCatagory getResourceCatagory() {
/* 112 */     return this.resourceCatagory;
/*     */   }
/*     */ 
/*     */   public void setResourceCatagory(ResourceCatagory resourceCatagory) {
/* 116 */     this.resourceCatagory = resourceCatagory;
/*     */   }
/*     */ 
/*     */   public boolean isDeleteStatus() {
/* 120 */     return this.deleteStatus;
/*     */   }
/*     */ 
/*     */   public void setDeleteStatus(boolean deleteStatus) {
/* 124 */     this.deleteStatus = deleteStatus;
/*     */   }
/*     */ 
/*     */   public boolean isEnable() {
/* 128 */     return this.enable;
/*     */   }
/*     */ 
/*     */   public void setEnable(boolean enable) {
/* 132 */     this.enable = enable;
/*     */   }
/*     */ 
/*     */   public String getIdentifier() {
/* 136 */     return this.identifier;
/*     */   }
/*     */ 
/*     */   public void setIdentifier(String identifier) {
/* 140 */     this.identifier = identifier;
/*     */   }
/*     */ }

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.vo.ResourceVo
 * JD-Core Version:    0.6.0
 */