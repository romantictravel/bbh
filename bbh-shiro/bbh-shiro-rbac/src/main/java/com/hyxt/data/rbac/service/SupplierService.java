package com.hyxt.data.rbac.service;

import com.hyxt.data.rbac.vo.SupplierVo;
import com.hyxt.data.rbac.vo.page.PageVo;
import com.hyxt.data.rbac.vo.page.PageableVo;
import java.util.List;

public abstract interface SupplierService
{
  public abstract List<SupplierVo> searchAll();

  public abstract boolean checkSupplierName(String paramString1, String paramString2);

  public abstract PageVo<SupplierVo> search(String paramString, PageableVo paramPageableVo);

  public abstract SupplierVo searchById(String paramString);

  public abstract List<SupplierVo> searchByName(String paramString, boolean paramBoolean);

  public abstract String insert(SupplierVo paramSupplierVo);

  public abstract void update(SupplierVo paramSupplierVo);

  public abstract void delete(String paramString);

  public abstract int getMerchantCount(String paramString);
}

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.service.SupplierService
 * JD-Core Version:    0.6.0
 */