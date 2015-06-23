package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_promotion_product")
public class PromotionProduct {
    @Id
    private Long promotions;

    @Id
    private Long products;

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
     * @return products
     */
    public Long getProducts() {
        return products;
    }

    /**
     * @param products
     */
    public void setProducts(Long products) {
        this.products = products;
    }
}