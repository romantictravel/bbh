package com.bbh.shop.api.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_product_category")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private Integer orders;

    private Integer grade;

    private String name;

    @Column(name = "seo_description")
    private String seoDescription;

    @Column(name = "seo_keywords")
    private String seoKeywords;

    @Column(name = "seo_title")
    private String seoTitle;

    @Column(name = "tree_path")
    private String treePath;

    private Long parent;

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
     * @return grade
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * @param grade
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
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
     * @return seo_description
     */
    public String getSeoDescription() {
        return seoDescription;
    }

    /**
     * @param seoDescription
     */
    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    /**
     * @return seo_keywords
     */
    public String getSeoKeywords() {
        return seoKeywords;
    }

    /**
     * @param seoKeywords
     */
    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    /**
     * @return seo_title
     */
    public String getSeoTitle() {
        return seoTitle;
    }

    /**
     * @param seoTitle
     */
    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    /**
     * @return tree_path
     */
    public String getTreePath() {
        return treePath;
    }

    /**
     * @param treePath
     */
    public void setTreePath(String treePath) {
        this.treePath = treePath;
    }

    /**
     * @return parent
     */
    public Long getParent() {
        return parent;
    }

    /**
     * @param parent
     */
    public void setParent(Long parent) {
        this.parent = parent;
    }
}