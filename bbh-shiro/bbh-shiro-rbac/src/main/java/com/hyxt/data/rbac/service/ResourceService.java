package com.hyxt.data.rbac.service;

import com.hyxt.data.rbac.em.ResourceCatagory;
import com.hyxt.data.rbac.vo.ResourceVo;
import java.util.List;
import java.util.Set;

public abstract interface ResourceService
{
  public abstract String insertResource(ResourceVo paramResourceVo);

  public abstract void updateResource(ResourceVo paramResourceVo);

  public abstract void deleteResource(String paramString);

  public abstract ResourceVo searchResourceById(String paramString);

  public abstract List<ResourceVo> findAll(ResourceCatagory paramResourceCatagory);

  public abstract boolean authorized(String paramString1, String paramString2);

  public abstract void sort(String[] paramArrayOfString);

  public abstract ResourceVo getUserResources(String paramString1, String paramString2);

  public abstract Set<String> getUserResourcesElement(String paramString1, String paramString2);

  public abstract List<ResourceVo> getResourcesOfRole(String paramString);
}

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.service.ResourceService
 * JD-Core Version:    0.6.0
 */