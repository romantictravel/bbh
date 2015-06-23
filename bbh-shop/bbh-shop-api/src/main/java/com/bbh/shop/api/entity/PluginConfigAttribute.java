package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_plugin_config_attribute")
public class PluginConfigAttribute {
    @Id
    @Column(name = "plugin_config")
    private Long pluginConfig;

    @Id
    private String name;

    private String attributes;

    /**
     * @return plugin_config
     */
    public Long getPluginConfig() {
        return pluginConfig;
    }

    /**
     * @param pluginConfig
     */
    public void setPluginConfig(Long pluginConfig) {
        this.pluginConfig = pluginConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return attributes
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     * @param attributes
     */
    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }
}