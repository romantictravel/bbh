package com.hyxt.data.rbac.service;

import com.hyxt.data.rbac.vo.DeviceInfoVo;
import com.hyxt.data.rbac.vo.OperateResult;
import com.hyxt.data.rbac.vo.page.PageVo;
import com.hyxt.data.rbac.vo.page.PageableVo;
import java.util.List;

public abstract interface DeviceInfoService
{
  public abstract DeviceInfoVo getDeviceInfoByCode(String paramString);

  public abstract DeviceInfoVo getDeviceInfoByCodeSimple(String paramString);

  public abstract boolean checkDeviceMD5Password(String paramString1, String paramString2);

  public abstract DeviceInfoVo getDeviceById(String paramString);

  public abstract List<DeviceInfoVo> getDevicesByUserId(String paramString);

  public abstract OperateResult deleteDeviceByCode(String paramString);

  public abstract OperateResult deleteDeviceById(String paramString);

  public abstract OperateResult insertDeviceInfo(DeviceInfoVo paramDeviceInfoVo, int paramInt);

  public abstract OperateResult updateDeviceInfo(DeviceInfoVo paramDeviceInfoVo);

  public abstract PageVo<DeviceInfoVo> searchDeviceInfo(String paramString1, String paramString2, String paramString3, PageableVo paramPageableVo);
}

/* Location:           D:\install\apache-maven-3.2.3\repository\com\hyxt\rbac-remote\5.9.0-SNAPSHOT\rbac-remote-5.9.0-20150327.071455-5.jar
 * Qualified Name:     com.hyxt.data.rbac.service.DeviceInfoService
 * JD-Core Version:    0.6.0
 */