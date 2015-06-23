package com.bbh.shop.api.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_member_rank")
public class MemberRank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private BigDecimal amount;

    @Column(name = "is_default")
    private Boolean isDefault;

    @Column(name = "is_special")
    private Boolean isSpecial;

    private String name;

    private Double scale;

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
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return is_default
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * @param isDefault
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * @return is_special
     */
    public Boolean getIsSpecial() {
        return isSpecial;
    }

    /**
     * @param isSpecial
     */
    public void setIsSpecial(Boolean isSpecial) {
        this.isSpecial = isSpecial;
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
     * @return scale
     */
    public Double getScale() {
        return scale;
    }

    /**
     * @param scale
     */
    public void setScale(Double scale) {
        this.scale = scale;
    }
}