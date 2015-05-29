package com.bbh.shiro.core.context;

import java.util.List;

public abstract interface IUserSessionVariable
{
  public abstract String getUserId();

  public abstract String getShopId();

  public abstract List<String> getStoreIds();

  public abstract List<String> getRoleIds();

  public abstract List<String> getRoleNames();
}
