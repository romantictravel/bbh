package com.bbh.shop.api.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "tb_product_member_price")
public class ProductMemberPrice {
    @Id
    private Long product;

    @Id
    @Column(name = "member_price_key")
    private Long memberPriceKey;

    @Column(name = "member_price")
    private BigDecimal memberPrice;

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
     * @return member_price_key
     */
    public Long getMemberPriceKey() {
        return memberPriceKey;
    }

    /**
     * @param memberPriceKey
     */
    public void setMemberPriceKey(Long memberPriceKey) {
        this.memberPriceKey = memberPriceKey;
    }

    /**
     * @return member_price
     */
    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    /**
     * @param memberPrice
     */
    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }
}