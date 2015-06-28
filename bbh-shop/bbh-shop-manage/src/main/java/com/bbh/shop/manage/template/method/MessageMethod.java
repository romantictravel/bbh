/*



 */
package com.bbh.shop.manage.template.method;

import com.bbh.common.utils.spring.SpringContextUtils;
import freemarker.template.SimpleScalar;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 模板方法 - 多语言
 * 
 * @author BBH Team
 * @version 1.0
 */
@Component
public class MessageMethod implements TemplateMethodModelEx {

	public Object exec(List arguments) throws TemplateModelException {
		if (arguments != null && !arguments.isEmpty() && arguments.get(0) != null && StringUtils.isNotEmpty(arguments.get(0).toString())) {
			String message = null;
			String code = arguments.get(0).toString();
			if (arguments.size() > 1) {
				Object[] args = arguments.subList(1, arguments.size()).toArray();
				message = SpringContextUtils.getMessage(code, args);
			} else {
				message = SpringContextUtils.getMessage(code);
			}
			return new SimpleScalar(message);
		}
		return null;
	}

}