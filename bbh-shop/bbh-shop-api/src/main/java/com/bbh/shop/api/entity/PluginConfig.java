package com.bbh.shop.api.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_plugin_config")
public class PluginConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private Integer orders;

    @Column(name = "is_enabled")
    private Boolean isEnabled;

    @Column(name = "plugin_id")
    private String pluginId;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return modify_date
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * @return orders
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * @param orders
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * @return is_enabled
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * @param isEnabled
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * @return plugin_id
     */
    public String getPluginId() {
        return pluginId;
    }

    /**
     * @param pluginId
     */
    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }
}