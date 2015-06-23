package com.bbh.shop.api.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_coupon")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    @Column(name = "begin_date")
    private Date beginDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "is_enabled")
    private Boolean isEnabled;

    @Column(name = "is_exchange")
    private Boolean isExchange;

    @Column(name = "maximum_price")
    private BigDecimal maximumPrice;

    @Column(name = "maximum_quantity")
    private Integer maximumQuantity;

    @Column(name = "minimum_price")
    private BigDecimal minimumPrice;

    @Column(name = "minimum_quantity")
    private Integer minimumQuantity;

    private String name;

    private Long point;

    private String prefix;

    @Column(name = "price_expression")
    private String priceExpression;

    private String introduction;

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
     * @return begin_date
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * @param beginDate
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * @return end_date
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return is_enabled
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * @param isEnabled
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * @return is_exchange
     */
    public Boolean getIsExchange() {
        return isExchange;
    }

    /**
     * @param isExchange
     */
    public void setIsExchange(Boolean isExchange) {
        this.isExchange = isExchange;
    }

    /**
     * @return maximum_price
     */
    public BigDecimal getMaximumPrice() {
        return maximumPrice;
    }

    /**
     * @param maximumPrice
     */
    public void setMaximumPrice(BigDecimal maximumPrice) {
        this.maximumPrice = maximumPrice;
    }

    /**
     * @return maximum_quantity
     */
    public Integer getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * @param maximumQuantity
     */
    public void setMaximumQuantity(Integer maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    /**
     * @return minimum_price
     */
    public BigDecimal getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * @param minimumPrice
     */
    public void setMinimumPrice(BigDecimal minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    /**
     * @return minimum_quantity
     */
    public Integer getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * @param minimumQuantity
     */
    public void setMinimumQuantity(Integer minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
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
     * @return point
     */
    public Long getPoint() {
        return point;
    }

    /**
     * @param point
     */
    public void setPoint(Long point) {
        this.point = point;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * @param prefix
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * @return price_expression
     */
    public String getPriceExpression() {
        return priceExpression;
    }

    /**
     * @param priceExpression
     */
    public void setPriceExpression(String priceExpression) {
        this.priceExpression = priceExpression;
    }

    /**
     * @return introduction
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * @param introduction
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}