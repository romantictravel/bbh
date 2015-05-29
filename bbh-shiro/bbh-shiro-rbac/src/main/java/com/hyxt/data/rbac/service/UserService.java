package com.hyxt.data.rbac.service;

import com.hyxt.data.rbac.vo.OperateResult;
import com.hyxt.data.rbac.vo.SearchUserVo;
import com.hyxt.data.rbac.vo.UserRoleSearch;
import com.hyxt.data.rbac.vo.UserVo;
import com.hyxt.data.rbac.vo.page.PageVo;
import com.hyxt.data.rbac.vo.page.PageableVo;
import java.util.List;
import java.util.Map;

public abstract interface UserService
{
  public abstract OperateResult changePassword(String paramString1, String paramString2, String paramString3);

  public abstract boolean checkPassword(String paramString1, String paramString2);

  public abstract OperateResult insertUser(UserVo paramUserVo);

  public abstract OperateResult updateUser(UserVo paramUserVo);

  public abstract UserVo findByUserId(String paramString);

  public abstract List<UserVo> getUsers(UserRoleSearch paramUserRoleSearch);

  public abstract UserVo findShopAdmin(String paramString);

  public abstract void resetShopAdminPassword(String paramString1, String paramString2);

  public abstract OperateResult deleteByUserId(String paramString);

  public abstract OperateResult updateUserStatus(String paramString, boolean paramBoolean);

  public abstract PageVo<Map> searchUserInfo(SearchUserVo paramSearchUserVo, PageableVo paramPageableVo);
}

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.service.UserService
 * JD-Core Version:    0.6.0
 */