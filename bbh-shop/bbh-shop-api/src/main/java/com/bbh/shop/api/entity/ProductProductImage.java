package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_product_product_image")
public class ProductProductImage {
    private Long product;

    private String large;

    private String medium;

    private Integer orders;

    private String source;

    private String thumbnail;

    private String title;

    /**
     * @return product
     */
    public Long getProduct() {
        return product;
    }

    /**
     * @param product
     */
    public void setProduct(Long product) {
        this.product = product;
    }

    /**
     * @return large
     */
    public String getLarge() {
        return large;
    }

    /**
     * @param large
     */
    public void setLarge(String large) {
        this.large = large;
    }

    /**
     * @return medium
     */
    public String getMedium() {
        return medium;
    }

    /**
     * @param medium
     */
    public void setMedium(String medium) {
        this.medium = medium;
    }

    /**
     * @return orders
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * @param orders
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * @param thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }
}