package com.bbh.shop.manage.common.captcha;

import com.bbh.shop.manage.common.Setting;
import com.bbh.shop.manage.common.SettingUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.image.BufferedImage;

/**
 * @author BBH TEAM
 * @Description
 * @Date: 2015/5/3
 * @Version:1.0.0
 */
@Component
public class CaptchaServiceImpl implements CaptchaService{

    @Autowired
    private com.octo.captcha.service.CaptchaService imageCaptchaService;

    public BufferedImage buildImage(String captchaId) {
        return (BufferedImage) imageCaptchaService.getChallengeForID(captchaId);
    }

    public boolean isValid(Setting.CaptchaType captchaType, String captchaId, String captcha) {
        Setting setting = SettingUtils.get();
        if (captchaType == null || ArrayUtils.contains(setting.getCaptchaTypes(), captchaType)) {
            if (StringUtils.isNotEmpty(captchaId) && StringUtils.isNotEmpty(captcha)) {
                try {
                    return imageCaptchaService.validateResponseForID(captchaId, captcha.toUpperCase());
                } catch (Exception e) {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}
