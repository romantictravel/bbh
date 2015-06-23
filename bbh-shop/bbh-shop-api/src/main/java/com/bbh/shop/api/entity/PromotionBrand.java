package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_promotion_brand")
public class PromotionBrand {
    @Id
    private Long promotions;

    @Id
    private Long brands;

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
     * @return brands
     */
    public Long getBrands() {
        return brands;
    }

    /**
     * @param brands
     */
    public void setBrands(Long brands) {
        this.brands = brands;
    }
}