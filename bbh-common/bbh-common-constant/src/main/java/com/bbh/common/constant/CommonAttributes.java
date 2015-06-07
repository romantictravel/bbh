/*



 */
package com.bbh.common.constant;

/**
 * 公共参数
 * 
 * @author KCSHOP Team
 * @version 3.0
 */
public final class CommonAttributes {

	/** 日期格式配比 */
	public static final String[] DATE_PATTERNS = new String[] { "yyyy", "yyyy-MM", "yyyyMM", "yyyy/MM", "yyyy-MM-dd", "yyyyMMdd", "yyyy/MM/dd", "yyyy-MM-dd HH:mm:ss", "yyyyMMddHHmmss", "yyyy/MM/dd HH:mm:ss" };
	/**配置文件位置**/
	public static final String SETTING_XML_PATH = "/settings/bbh-setting.xml";

	/**
	 * 不可实例化
	 */
	private CommonAttributes() {
	}

}