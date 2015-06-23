package com.bbh.shop.api.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_attribute")
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private Integer orders;

    private String name;

    @Column(name = "property_index")
    private Integer propertyIndex;

    @Column(name = "product_category")
    private Long productCategory;

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
     * @return property_index
     */
    public Integer getPropertyIndex() {
        return propertyIndex;
    }

    /**
     * @param propertyIndex
     */
    public void setPropertyIndex(Integer propertyIndex) {
        this.propertyIndex = propertyIndex;
    }

    /**
     * @return product_category
     */
    public Long getProductCategory() {
        return productCategory;
    }

    /**
     * @param productCategory
     */
    public void setProductCategory(Long productCategory) {
        this.productCategory = productCategory;
    }
}