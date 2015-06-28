package com.bbh.config.mvc;

import org.springframework.boot.autoconfigure.freemarker.FreeMarkerProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by roman_000 on 2015/6/22.
 */
@ConfigurationProperties(prefix = "spring.freemarker")
public class FreeMarkerExtendProperties extends FreeMarkerProperties{
    private Map<String,Object> variables=new HashMap<String, Object>();

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }
}
