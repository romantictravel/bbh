package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_product_specification_value")
public class ProductSpecificationValue {
    @Id
    private Long products;

    @Id
    @Column(name = "specification_values")
    private Long specificationValues;

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
     * @return specification_values
     */
    public Long getSpecificationValues() {
        return specificationValues;
    }

    /**
     * @param specificationValues
     */
    public void setSpecificationValues(Long specificationValues) {
        this.specificationValues = specificationValues;
    }
}