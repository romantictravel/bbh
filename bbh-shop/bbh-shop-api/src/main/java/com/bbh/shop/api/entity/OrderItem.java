package com.bbh.shop.api.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "is_gift")
    private Boolean isGift;

    private String name;

    private BigDecimal price;

    private Integer quantity;

    @Column(name = "return_quantity")
    private Integer returnQuantity;

    @Column(name = "shipped_quantity")
    private Integer shippedQuantity;

    private String sn;

    private String thumbnail;

    private Integer weight;

    private Long orders;

    private Long product;

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
     * @return full_name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return is_gift
     */
    public Boolean getIsGift() {
        return isGift;
    }

    /**
     * @param isGift
     */
    public void setIsGift(Boolean isGift) {
        this.isGift = isGift;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * @return return_quantity
     */
    public Integer getReturnQuantity() {
        return returnQuantity;
    }

    /**
     * @param returnQuantity
     */
    public void setReturnQuantity(Integer returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    /**
     * @return shipped_quantity
     */
    public Integer getShippedQuantity() {
        return shippedQuantity;
    }

    /**
     * @param shippedQuantity
     */
    public void setShippedQuantity(Integer shippedQuantity) {
        this.shippedQuantity = shippedQuantity;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return sn;
    }

    /**
     * @param sn
     */
    public void setSn(String sn) {
        this.sn = sn;
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
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

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
}