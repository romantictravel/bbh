package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_member_attribute_option")
public class MemberAttributeOption {
    @Column(name = "member_attribute")
    private Long memberAttribute;

    private String options;

    /**
     * @return member_attribute
     */
    public Long getMemberAttribute() {
        return memberAttribute;
    }

    /**
     * @param memberAttribute
     */
    public void setMemberAttribute(Long memberAttribute) {
        this.memberAttribute = memberAttribute;
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