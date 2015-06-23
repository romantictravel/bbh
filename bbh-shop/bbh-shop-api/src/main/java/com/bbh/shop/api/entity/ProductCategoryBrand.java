package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_product_category_brand")
public class ProductCategoryBrand {
    @Id
    @Column(name = "product_categories")
    private Long productCategories;

    @Id
    private Long brands;

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