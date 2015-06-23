package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_order_coupon")
public class OrderCoupon {
    private Long orders;

    private Long coupons;

    /**
     * @return orders
     */
    public Long getOrders() {
        return orders;
    }

    /**
     * @param orders
     */
    public void setOrders(Long orders) {
        this.orders = orders;
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