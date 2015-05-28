/*



 */
package com.bbh.shop.manage.common;

/**
 * 公共参数
 * 
 * @author KCSHOP Team
 * @version 3.0
 */
public final class CommonAttributes {

	/** 日期格式配比 */
	public static final String[] DATE_PATTERNS = new String[] { "yyyy", "yyyy-MM", "yyyyMM", "yyyy/MM", "yyyy-MM-dd", "yyyyMMdd", "yyyy/MM/dd", "yyyy-MM-dd HH:mm:ss", "yyyyMMddHHmmss", "yyyy/MM/dd HH:mm:ss" };

	/**xml文件路径 */
	public static final String SETTING_XML_PATH = "/setting/setting.xml";

	/**properties文件路径 */
	public static final String BASE_PROPERTIES_PATH = "/application.properties";
	/**
	 * 不可实例化
	 */
	private CommonAttributes() {
	}

}