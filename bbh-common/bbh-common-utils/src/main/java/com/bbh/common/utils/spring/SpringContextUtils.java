/*



 */
package com.bbh.common.utils.spring;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;

/**
 * Utils - Spring
 *
 * @author BBH Team
 * @version 1.0
 */
@Component
@Lazy(false)
public final class SpringContextUtils implements ApplicationContextAware, DisposableBean {
	/** applicationContext */
	private static ApplicationContext applicationContext;

	private SpringContextUtils() {
	}

	public void setApplicationContext(ApplicationContext applicationContext) {
		SpringContextUtils.applicationContext = applicationContext;
	}

	public void destroy() throws Exception {
		applicationContext = null;
	}

	/**
	 * 获取applicationContext
	 *
	 * @return applicationContext
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * 获取实例
	 *
	 * @param name
	 *            Bean名称
	 * @return 实例
	 */
	public static Object getBean(String name) {
		Assert.hasText(name);
		assertContextInjected();
		return applicationContext.getBean(name);
	}

	/**
	 * 获取实例
	 *
	 * @param name
	 *            Bean名称
	 * @param type
	 *            Bean类型
	 * @return 实例
	 */
	public static <T> T getBean(String name, Class<T> type) {
		Assert.hasText(name);
		Assert.notNull(type);
		assertContextInjected();
		return applicationContext.getBean(name, type);
	}

	/**
	 * 获取国际化消息
	 *
	 * @param code
	 *            代码
	 * @param args
	 *            参数
	 * @return 国际化消息
	 */
	public static String getMessage(String code, Object... args) {
		LocaleResolver localeResolver = getBean("localeResolver", LocaleResolver.class);
		Locale locale = localeResolver.resolveLocale(null);
		return applicationContext.getMessage(code, args, locale);
	}

	/**
	 * 检查ApplicationContext不为空.
	 */
	private static void assertContextInjected() {
		Validate.validState(applicationContext != null, "applicaitonContext属性未注入.");
	}

}