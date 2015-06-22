package com.bbh.config.mvc;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * Created by roman_000 on 2015/6/22.
 */
@ConfigurationProperties(prefix = "spring.freemarker")
public class FreeMarkerExtendProperties {
    private Map<String,Object> variables;

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }
}
