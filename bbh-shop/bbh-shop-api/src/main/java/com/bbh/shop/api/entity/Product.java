package com.bbh.shop.api.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    @Column(name = "allocated_stock")
    private Integer allocatedStock;

    @Column(name = "attribute_value0")
    private String attributeValue0;

    @Column(name = "attribute_value1")
    private String attributeValue1;

    @Column(name = "attribute_value10")
    private String attributeValue10;

    @Column(name = "attribute_value11")
    private String attributeValue11;

    @Column(name = "attribute_value12")
    private String attributeValue12;

    @Column(name = "attribute_value13")
    private String attributeValue13;

    @Column(name = "attribute_value14")
    private String attributeValue14;

    @Column(name = "attribute_value15")
    private String attributeValue15;

    @Column(name = "attribute_value16")
    private String attributeValue16;

    @Column(name = "attribute_value17")
    private String attributeValue17;

    @Column(name = "attribute_value18")
    private String attributeValue18;

    @Column(name = "attribute_value19")
    private String attributeValue19;

    @Column(name = "attribute_value2")
    private String attributeValue2;

    @Column(name = "attribute_value3")
    private String attributeValue3;

    @Column(name = "attribute_value4")
    private String attributeValue4;

    @Column(name = "attribute_value5")
    private String attributeValue5;

    @Column(name = "attribute_value6")
    private String attributeValue6;

    @Column(name = "attribute_value7")
    private String attributeValue7;

    @Column(name = "attribute_value8")
    private String attributeValue8;

    @Column(name = "attribute_value9")
    private String attributeValue9;

    private BigDecimal cost;

    @Column(name = "full_name")
    private String fullName;

    private Long hits;

    private String image;

    @Column(name = "is_gift")
    private Boolean isGift;

    @Column(name = "is_list")
    private Boolean isList;

    @Column(name = "is_marketable")
    private Boolean isMarketable;

    @Column(name = "is_top")
    private Boolean isTop;

    private String keyword;

    @Column(name = "market_price")
    private BigDecimal marketPrice;

    private String memo;

    @Column(name = "month_hits")
    private Long monthHits;

    @Column(name = "month_hits_date")
    private Date monthHitsDate;

    @Column(name = "month_sales")
    private Long monthSales;

    @Column(name = "month_sales_date")
    private Date monthSalesDate;

    private String name;

    private Long point;

    private BigDecimal price;

    private Long sales;

    private Float score;

    @Column(name = "score_count")
    private Long scoreCount;

    @Column(name = "seo_description")
    private String seoDescription;

    @Column(name = "seo_keywords")
    private String seoKeywords;

    @Column(name = "seo_title")
    private String seoTitle;

    private String sn;

    private Integer stock;

    @Column(name = "stock_memo")
    private String stockMemo;

    @Column(name = "total_score")
    private Long totalScore;

    private String unit;

    @Column(name = "week_hits")
    private Long weekHits;

    @Column(name = "week_hits_date")
    private Date weekHitsDate;

    @Column(name = "week_sales")
    private Long weekSales;

    @Column(name = "week_sales_date")
    private Date weekSalesDate;

    private Integer weight;

    private Long brand;

    private Long goods;

    @Column(name = "product_category")
    private Long productCategory;

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
     * @return allocated_stock
     */
    public Integer getAllocatedStock() {
        return allocatedStock;
    }

    /**
     * @param allocatedStock
     */
    public void setAllocatedStock(Integer allocatedStock) {
        this.allocatedStock = allocatedStock;
    }

    /**
     * @return attribute_value0
     */
    public String getAttributeValue0() {
        return attributeValue0;
    }

    /**
     * @param attributeValue0
     */
    public void setAttributeValue0(String attributeValue0) {
        this.attributeValue0 = attributeValue0;
    }

    /**
     * @return attribute_value1
     */
    public String getAttributeValue1() {
        return attributeValue1;
    }

    /**
     * @param attributeValue1
     */
    public void setAttributeValue1(String attributeValue1) {
        this.attributeValue1 = attributeValue1;
    }

    /**
     * @return attribute_value10
     */
    public String getAttributeValue10() {
        return attributeValue10;
    }

    /**
     * @param attributeValue10
     */
    public void setAttributeValue10(String attributeValue10) {
        this.attributeValue10 = attributeValue10;
    }

    /**
     * @return attribute_value11
     */
    public String getAttributeValue11() {
        return attributeValue11;
    }

    /**
     * @param attributeValue11
     */
    public void setAttributeValue11(String attributeValue11) {
        this.attributeValue11 = attributeValue11;
    }

    /**
     * @return attribute_value12
     */
    public String getAttributeValue12() {
        return attributeValue12;
    }

    /**
     * @param attributeValue12
     */
    public void setAttributeValue12(String attributeValue12) {
        this.attributeValue12 = attributeValue12;
    }

    /**
     * @return attribute_value13
     */
    public String getAttributeValue13() {
        return attributeValue13;
    }

    /**
     * @param attributeValue13
     */
    public void setAttributeValue13(String attributeValue13) {
        this.attributeValue13 = attributeValue13;
    }

    /**
     * @return attribute_value14
     */
    public String getAttributeValue14() {
        return attributeValue14;
    }

    /**
     * @param attributeValue14
     */
    public void setAttributeValue14(String attributeValue14) {
        this.attributeValue14 = attributeValue14;
    }

    /**
     * @return attribute_value15
     */
    public String getAttributeValue15() {
        return attributeValue15;
    }

    /**
     * @param attributeValue15
     */
    public void setAttributeValue15(String attributeValue15) {
        this.attributeValue15 = attributeValue15;
    }

    /**
     * @return attribute_value16
     */
    public String getAttributeValue16() {
        return attributeValue16;
    }

    /**
     * @param attributeValue16
     */
    public void setAttributeValue16(String attributeValue16) {
        this.attributeValue16 = attributeValue16;
    }

    /**
     * @return attribute_value17
     */
    public String getAttributeValue17() {
        return attributeValue17;
    }

    /**
     * @param attributeValue17
     */
    public void setAttributeValue17(String attributeValue17) {
        this.attributeValue17 = attributeValue17;
    }

    /**
     * @return attribute_value18
     */
    public String getAttributeValue18() {
        return attributeValue18;
    }

    /**
     * @param attributeValue18
     */
    public void setAttributeValue18(String attributeValue18) {
        this.attributeValue18 = attributeValue18;
    }

    /**
     * @return attribute_value19
     */
    public String getAttributeValue19() {
        return attributeValue19;
    }

    /**
     * @param attributeValue19
     */
    public void setAttributeValue19(String attributeValue19) {
        this.attributeValue19 = attributeValue19;
    }

    /**
     * @return attribute_value2
     */
    public String getAttributeValue2() {
        return attributeValue2;
    }

    /**
     * @param attributeValue2
     */
    public void setAttributeValue2(String attributeValue2) {
        this.attributeValue2 = attributeValue2;
    }

    /**
     * @return attribute_value3
     */
    public String getAttributeValue3() {
        return attributeValue3;
    }

    /**
     * @param attributeValue3
     */
    public void setAttributeValue3(String attributeValue3) {
        this.attributeValue3 = attributeValue3;
    }

    /**
     * @return attribute_value4
     */
    public String getAttributeValue4() {
        return attributeValue4;
    }

    /**
     * @param attributeValue4
     */
    public void setAttributeValue4(String attributeValue4) {
        this.attributeValue4 = attributeValue4;
    }

    /**
     * @return attribute_value5
     */
    public String getAttributeValue5() {
        return attributeValue5;
    }

    /**
     * @param attributeValue5
     */
    public void setAttributeValue5(String attributeValue5) {
        this.attributeValue5 = attributeValue5;
    }

    /**
     * @return attribute_value6
     */
    public String getAttributeValue6() {
        return attributeValue6;
    }

    /**
     * @param attributeValue6
     */
    public void setAttributeValue6(String attributeValue6) {
        this.attributeValue6 = attributeValue6;
    }

    /**
     * @return attribute_value7
     */
    public String getAttributeValue7() {
        return attributeValue7;
    }

    /**
     * @param attributeValue7
     */
    public void setAttributeValue7(String attributeValue7) {
        this.attributeValue7 = attributeValue7;
    }

    /**
     * @return attribute_value8
     */
    public String getAttributeValue8() {
        return attributeValue8;
    }

    /**
     * @param attributeValue8
     */
    public void setAttributeValue8(String attributeValue8) {
        this.attributeValue8 = attributeValue8;
    }

    /**
     * @return attribute_value9
     */
    public String getAttributeValue9() {
        return attributeValue9;
    }

    /**
     * @param attributeValue9
     */
    public void setAttributeValue9(String attributeValue9) {
        this.attributeValue9 = attributeValue9;
    }

    /**
     * @return cost
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * @param cost
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
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
     * @return hits
     */
    public Long getHits() {
        return hits;
    }

    /**
     * @param hits
     */
    public void setHits(Long hits) {
        this.hits = hits;
    }

    /**
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
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
     * @return is_list
     */
    public Boolean getIsList() {
        return isList;
    }

    /**
     * @param isList
     */
    public void setIsList(Boolean isList) {
        this.isList = isList;
    }

    /**
     * @return is_marketable
     */
    public Boolean getIsMarketable() {
        return isMarketable;
    }

    /**
     * @param isMarketable
     */
    public void setIsMarketable(Boolean isMarketable) {
        this.isMarketable = isMarketable;
    }

    /**
     * @return is_top
     */
    public Boolean getIsTop() {
        return isTop;
    }

    /**
     * @param isTop
     */
    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * @param keyword
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * @return market_price
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * @param marketPrice
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @return month_hits
     */
    public Long getMonthHits() {
        return monthHits;
    }

    /**
     * @param monthHits
     */
    public void setMonthHits(Long monthHits) {
        this.monthHits = monthHits;
    }

    /**
     * @return month_hits_date
     */
    public Date getMonthHitsDate() {
        return monthHitsDate;
    }

    /**
     * @param monthHitsDate
     */
    public void setMonthHitsDate(Date monthHitsDate) {
        this.monthHitsDate = monthHitsDate;
    }

    /**
     * @return month_sales
     */
    public Long getMonthSales() {
        return monthSales;
    }

    /**
     * @param monthSales
     */
    public void setMonthSales(Long monthSales) {
        this.monthSales = monthSales;
    }

    /**
     * @return month_sales_date
     */
    public Date getMonthSalesDate() {
        return monthSalesDate;
    }

    /**
     * @param monthSalesDate
     */
    public void setMonthSalesDate(Date monthSalesDate) {
        this.monthSalesDate = monthSalesDate;
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
     * @return sales
     */
    public Long getSales() {
        return sales;
    }

    /**
     * @param sales
     */
    public void setSales(Long sales) {
        this.sales = sales;
    }

    /**
     * @return score
     */
    public Float getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * @return score_count
     */
    public Long getScoreCount() {
        return scoreCount;
    }

    /**
     * @param scoreCount
     */
    public void setScoreCount(Long scoreCount) {
        this.scoreCount = scoreCount;
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
     * @return stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * @param stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * @return stock_memo
     */
    public String getStockMemo() {
        return stockMemo;
    }

    /**
     * @param stockMemo
     */
    public void setStockMemo(String stockMemo) {
        this.stockMemo = stockMemo;
    }

    /**
     * @return total_score
     */
    public Long getTotalScore() {
        return totalScore;
    }

    /**
     * @param totalScore
     */
    public void setTotalScore(Long totalScore) {
        this.totalScore = totalScore;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return week_hits
     */
    public Long getWeekHits() {
        return weekHits;
    }

    /**
     * @param weekHits
     */
    public void setWeekHits(Long weekHits) {
        this.weekHits = weekHits;
    }

    /**
     * @return week_hits_date
     */
    public Date getWeekHitsDate() {
        return weekHitsDate;
    }

    /**
     * @param weekHitsDate
     */
    public void setWeekHitsDate(Date weekHitsDate) {
        this.weekHitsDate = weekHitsDate;
    }

    /**
     * @return week_sales
     */
    public Long getWeekSales() {
        return weekSales;
    }

    /**
     * @param weekSales
     */
    public void setWeekSales(Long weekSales) {
        this.weekSales = weekSales;
    }

    /**
     * @return week_sales_date
     */
    public Date getWeekSalesDate() {
        return weekSalesDate;
    }

    /**
     * @param weekSalesDate
     */
    public void setWeekSalesDate(Date weekSalesDate) {
        this.weekSalesDate = weekSalesDate;
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
     * @return brand
     */
    public Long getBrand() {
        return brand;
    }

    /**
     * @param brand
     */
    public void setBrand(Long brand) {
        this.brand = brand;
    }

    /**
     * @return goods
     */
    public Long getGoods() {
        return goods;
    }

    /**
     * @param goods
     */
    public void setGoods(Long goods) {
        this.goods = goods;
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