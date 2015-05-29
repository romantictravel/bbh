package com.hyxt.data.rbac.service;

import com.hyxt.data.rbac.em.RoleType;
import com.hyxt.data.rbac.vo.RoleVo;
import com.hyxt.data.rbac.vo.page.PageVo;
import com.hyxt.data.rbac.vo.page.PageableVo;
import java.util.List;

public abstract interface RoleService
{
  public abstract PageVo<RoleVo> searchRoles(String paramString1, String paramString2, RoleType paramRoleType, PageableVo paramPageableVo);

  public abstract List<RoleVo> searchRolesByRoleType(RoleType paramRoleType);

  public abstract List<RoleVo> searchSpecialRoles(String[] paramArrayOfString);

  public abstract List<RoleVo> searchRolesByShopId(String paramString);

  public abstract String insertRole(RoleVo paramRoleVo);

  public abstract void updateRole(RoleVo paramRoleVo);

  public abstract void deleteRole(String paramString);

  public abstract RoleVo searchById(String paramString);

  public abstract void updateRoleResource(RoleVo paramRoleVo, String[] paramArrayOfString);

  public abstract boolean checkName(String paramString1, String paramString2, String paramString3, RoleType paramRoleType);
}

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.service.RoleService
 * JD-Core Version:    0.6.0
 */