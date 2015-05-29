package com.bbh.shiro.core.context;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionContextHolder {
    private static final Logger log = LoggerFactory.getLogger(SessionContextHolder.class);

    public static SessionVariable getSessionContext() {
        try {
            Subject subject = SecurityUtils.getSubject();

            if ((subject != null) && (subject.getPrincipal() != null) && ((subject.getPrincipal() instanceof SessionVariable))) {
                return (SessionVariable) subject.getPrincipal();
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
