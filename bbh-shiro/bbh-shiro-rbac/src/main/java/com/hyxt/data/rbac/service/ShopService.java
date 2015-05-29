package com.hyxt.data.rbac.service;

import com.hyxt.data.rbac.em.ShopFn;
import com.hyxt.data.rbac.vo.ShopAnnualVo;
import com.hyxt.data.rbac.vo.ShopInfo;
import com.hyxt.data.rbac.vo.ShopStore;
import com.hyxt.data.rbac.vo.ShopVo;
import com.hyxt.data.rbac.vo.StoreByCircleVo;
import com.hyxt.data.rbac.vo.StoreVo;
import com.hyxt.data.rbac.vo.page.PageVo;
import com.hyxt.data.rbac.vo.page.PageableVo;
import java.util.List;

public abstract interface ShopService
{
  public abstract boolean merchantNameSingle(String paramString1, String paramString2);

  public abstract PageVo<ShopVo> searchShops(String paramString1, String paramString2, String paramString3, PageableVo paramPageableVo);

  public abstract List<ShopInfo> searchShopsByName(String paramString, boolean paramBoolean);

  public abstract List<ShopStore> searchShopsByFn(String paramString);

  public abstract int searchShopsByCategory(String paramString);

  public abstract ShopVo findShopVo(String paramString);

  public abstract ShopInfo findShopInfo(String paramString);

  public abstract String insertShop(ShopVo paramShopVo, String paramString1, String paramString2);

  public abstract void openFunctionForShop(String paramString, ShopFn paramShopFn);

  public abstract String renew(ShopAnnualVo paramShopAnnualVo);

  public abstract void updateShop(ShopVo paramShopVo);

  public abstract void disableShop(String paramString);

  public abstract void enableShop(String paramString);

  public abstract List<StoreVo> getStoresByShopId(String paramString);

  public abstract List<StoreVo> getAllStoresByShopId(String paramString);

  public abstract List<StoreVo> searchStoreHaveLatAndLon(String paramString);

  public abstract List<StoreVo> getStoreVoByStoreIds(String paramString, List<String> paramList);

  public abstract PageVo<StoreVo> searchStores(String paramString1, String paramString2, String paramString3, String paramString4, PageableVo paramPageableVo);

  public abstract StoreVo findStoreById(String paramString);

  public abstract StoreVo findStoreByCode(String paramString);

  public abstract String insertStore(StoreVo paramStoreVo);

  public abstract void updateStore(StoreVo paramStoreVo);

  public abstract void disableStore(String paramString);

  public abstract void enableStore(String paramString);

  public abstract String insertStoreBatch(List<StoreVo> paramList);

  public abstract List<StoreVo> getStoresByParentId(String paramString, boolean paramBoolean1, boolean paramBoolean2);

  public abstract PageVo<StoreVo> getStoresByParentId(String paramString, PageableVo paramPageableVo, boolean paramBoolean1, boolean paramBoolean2);

  public abstract List<StoreVo> getTopStoresByShopId(String paramString, boolean paramBoolean1, boolean paramBoolean2);

  public abstract PageVo<StoreByCircleVo> getStoreByCircle(String paramString, PageableVo paramPageableVo);

  public abstract PageVo<StoreByCircleVo> getStoreByCircleProvince(String paramString, PageableVo paramPageableVo);

  public abstract int getStoreCount(String paramString);

  public abstract void updateStoreSort(String paramString, List<String> paramList);

  public abstract boolean findStoreByNameAndShopId(String paramString1, String paramString2, String paramString3);

  public abstract List<StoreVo> getUserStores(String paramString);

  public abstract PageVo<StoreVo> searchStoreByUserId(String paramString1, String paramString2, String paramString3, PageableVo paramPageableVo);

  public abstract void initialize(String paramString);

  public abstract List<StoreVo> getStoreByCityName(String paramString1, String paramString2);

  public abstract StoreVo getStoreByStoreName(String paramString1, String paramString2);
}

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.service.ShopService
 * JD-Core Version:    0.6.0
 */