package com.bbh.shop.api.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_coupon_code")
public class CouponCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private String code;

    @Column(name = "is_used")
    private Boolean isUsed;

    @Column(name = "used_date")
    private Date usedDate;

    private Long coupon;

    private Long member;

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
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return is_used
     */
    public Boolean getIsUsed() {
        return isUsed;
    }

    /**
     * @param isUsed
     */
    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    /**
     * @return used_date
     */
    public Date getUsedDate() {
        return usedDate;
    }

    /**
     * @param usedDate
     */
    public void setUsedDate(Date usedDate) {
        this.usedDate = usedDate;
    }

    /**
     * @return coupon
     */
    public Long getCoupon() {
        return coupon;
    }

    /**
     * @param coupon
     */
    public void setCoupon(Long coupon) {
        this.coupon = coupon;
    }

    /**
     * @return member
     */
    public Long getMember() {
        return member;
    }

    /**
     * @param member
     */
    public void setMember(Long member) {
        this.member = member;
    }
}