package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_promotion_coupon")
public class PromotionCoupon {
    @Id
    private Long promotions;

    @Id
    private Long coupons;

    /**
     * @return promotions
     */
    public Long getPromotions() {
        return promotions;
    }

    /**
     * @param promotions
     */
    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    /**
     * @return coupons
     */
    public Long getCoupons() {
        return coupons;
    }

    /**
     * @param coupons
     */
    public void setCoupons(Long coupons) {
        this.coupons = coupons;
    }
}