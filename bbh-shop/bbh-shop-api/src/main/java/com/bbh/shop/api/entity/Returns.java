package com.bbh.shop.api.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_returns")
public class Returns {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private String address;

    private String area;

    @Column(name = "delivery_corp")
    private String deliveryCorp;

    private BigDecimal freight;

    private String memo;

    private String operator;

    private String phone;

    private String shipper;

    @Column(name = "shipping_method")
    private String shippingMethod;

    private String sn;

    @Column(name = "tracking_no")
    private String trackingNo;

    @Column(name = "zip_code")
    private String zipCode;

    private Long orders;

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
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return delivery_corp
     */
    public String getDeliveryCorp() {
        return deliveryCorp;
    }

    /**
     * @param deliveryCorp
     */
    public void setDeliveryCorp(String deliveryCorp) {
        this.deliveryCorp = deliveryCorp;
    }

    /**
     * @return freight
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * @param freight
     */
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
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
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return shipper
     */
    public String getShipper() {
        return shipper;
    }

    /**
     * @param shipper
     */
    public void setShipper(String shipper) {
        this.shipper = shipper;
    }

    /**
     * @return shipping_method
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * @param shippingMethod
     */
    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
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
     * @return tracking_no
     */
    public String getTrackingNo() {
        return trackingNo;
    }

    /**
     * @param trackingNo
     */
    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    /**
     * @return zip_code
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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
}