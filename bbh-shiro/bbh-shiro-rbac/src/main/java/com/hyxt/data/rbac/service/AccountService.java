package com.hyxt.data.rbac.service;

import com.hyxt.data.rbac.vo.ResourceVo;
import com.hyxt.data.rbac.vo.RoleVo;
import com.hyxt.data.rbac.vo.UserVo;
import java.util.List;

public abstract interface AccountService
{
  public abstract UserVo findUserByUserId(String paramString);

  public abstract List<RoleVo> findAllRoles();

  public abstract List<ResourceVo> getUserResources(String paramString);

  public abstract List<ResourceVo> findResourcesByAppCode(String paramString);

  public abstract List<ResourceVo> findResourceByAppCode(String paramString);
}

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.service.AccountService
 * JD-Core Version:    0.6.0
 */