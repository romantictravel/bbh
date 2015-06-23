package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_attribute_option")
public class AttributeOption {
    private Long attribute;

    private String options;

    /**
     * @return attribute
     */
    public Long getAttribute() {
        return attribute;
    }

    /**
     * @param attribute
     */
    public void setAttribute(Long attribute) {
        this.attribute = attribute;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return options;
    }

    /**
     * @param options
     */
    public void setOptions(String options) {
        this.options = options;
    }
}