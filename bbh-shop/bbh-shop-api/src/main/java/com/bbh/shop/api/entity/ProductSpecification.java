package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_product_specification")
public class ProductSpecification {
    @Id
    private Long products;

    @Id
    private Long specifications;

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

    /**
     * @return specifications
     */
    public Long getSpecifications() {
        return specifications;
    }

    /**
     * @param specifications
     */
    public void setSpecifications(Long specifications) {
        this.specifications = specifications;
    }
}