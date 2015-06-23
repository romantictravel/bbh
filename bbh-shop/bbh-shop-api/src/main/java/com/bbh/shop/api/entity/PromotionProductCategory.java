package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_promotion_product_category")
public class PromotionProductCategory {
    @Id
    private Long promotions;

    @Id
    @Column(name = "product_categories")
    private Long productCategories;

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
     * @return product_categories
     */
    public Long getProductCategories() {
        return productCategories;
    }

    /**
     * @param productCategories
     */
    public void setProductCategories(Long productCategories) {
        this.productCategories = productCategories;
    }
}