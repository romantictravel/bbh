package com.bbh.shop.api.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_shipping_method")
public class ShippingMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private Integer orders;

    @Column(name = "continue_price")
    private BigDecimal continuePrice;

    @Column(name = "continue_weight")
    private Integer continueWeight;

    @Column(name = "first_price")
    private BigDecimal firstPrice;

    @Column(name = "first_weight")
    private Integer firstWeight;

    private String icon;

    private String name;

    @Column(name = "default_delivery_corp")
    private Long defaultDeliveryCorp;

    private String description;

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
     * @return continue_price
     */
    public BigDecimal getContinuePrice() {
        return continuePrice;
    }

    /**
     * @param continuePrice
     */
    public void setContinuePrice(BigDecimal continuePrice) {
        this.continuePrice = continuePrice;
    }

    /**
     * @return continue_weight
     */
    public Integer getContinueWeight() {
        return continueWeight;
    }

    /**
     * @param continueWeight
     */
    public void setContinueWeight(Integer continueWeight) {
        this.continueWeight = continueWeight;
    }

    /**
     * @return first_price
     */
    public BigDecimal getFirstPrice() {
        return firstPrice;
    }

    /**
     * @param firstPrice
     */
    public void setFirstPrice(BigDecimal firstPrice) {
        this.firstPrice = firstPrice;
    }

    /**
     * @return first_weight
     */
    public Integer getFirstWeight() {
        return firstWeight;
    }

    /**
     * @param firstWeight
     */
    public void setFirstWeight(Integer firstWeight) {
        this.firstWeight = firstWeight;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
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
     * @return default_delivery_corp
     */
    public Long getDefaultDeliveryCorp() {
        return defaultDeliveryCorp;
    }

    /**
     * @param defaultDeliveryCorp
     */
    public void setDefaultDeliveryCorp(Long defaultDeliveryCorp) {
        this.defaultDeliveryCorp = defaultDeliveryCorp;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}