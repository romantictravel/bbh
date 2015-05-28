package com.bbh.shop.manage.common.captcha;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.bbh.shop.manage.common.Setting;
import com.bbh.shop.manage.common.SettingUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.awt.image.BufferedImage;

/**
 * Service - 验证码
 * @author bbh team
 * @version 1.0
 */
@Component
public class CaptchaServiceImpl implements CaptchaService {

	@Resource(name = "imageCaptchaService")
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