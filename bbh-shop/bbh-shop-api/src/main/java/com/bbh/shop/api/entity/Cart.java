package com.bbh.shop.api.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    @Column(name = "cart_key")
    private String cartKey;

    private Long member;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return modify_date
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * @return cart_key
     */
    public String getCartKey() {
        return cartKey;
    }

    /**
     * @param cartKey
     */
    public void setCartKey(String cartKey) {
        this.cartKey = cartKey;
    }

    /**
     * @return member
     */
    public Long getMember() {
        return member;
    }

    /**
     * @param member
     */
    public void setMember(Long member) {
        this.member = member;
    }
}