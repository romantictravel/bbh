package com.bbh.shop.api.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private String address;

    @Column(name = "amount_paid")
    private BigDecimal amountPaid;

    @Column(name = "area_name")
    private String areaName;

    private String consignee;

    @Column(name = "coupon_discount")
    private BigDecimal couponDiscount;

    private Date expire;

    private BigDecimal fee;

    private BigDecimal freight;

    @Column(name = "invoice_title")
    private String invoiceTitle;

    @Column(name = "is_allocated_stock")
    private Boolean isAllocatedStock;

    @Column(name = "is_invoice")
    private Boolean isInvoice;

    @Column(name = "lock_expire")
    private Date lockExpire;

    private String memo;

    @Column(name = "offset_amount")
    private BigDecimal offsetAmount;

    @Column(name = "order_status")
    private Integer orderStatus;

    @Column(name = "payment_method_name")
    private String paymentMethodName;

    @Column(name = "payment_status")
    private Integer paymentStatus;

    private String phone;

    private Long point;

    private String promotion;

    @Column(name = "promotion_discount")
    private BigDecimal promotionDiscount;

    @Column(name = "shipping_method_name")
    private String shippingMethodName;

    @Column(name = "shipping_status")
    private Integer shippingStatus;

    private String sn;

    private BigDecimal tax;

    @Column(name = "zip_code")
    private String zipCode;

    private Long area;

    @Column(name = "coupon_code")
    private Long couponCode;

    private Long member;

    private Long operator;

    @Column(name = "payment_method")
    private Long paymentMethod;

    @Column(name = "shipping_method")
    private Long shippingMethod;

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
     * @return amount_paid
     */
    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    /**
     * @param amountPaid
     */
    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    /**
     * @return area_name
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * @param areaName
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * @return consignee
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * @param consignee
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * @return coupon_discount
     */
    public BigDecimal getCouponDiscount() {
        return couponDiscount;
    }

    /**
     * @param couponDiscount
     */
    public void setCouponDiscount(BigDecimal couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    /**
     * @return expire
     */
    public Date getExpire() {
        return expire;
    }

    /**
     * @param expire
     */
    public void setExpire(Date expire) {
        this.expire = expire;
    }

    /**
     * @return fee
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * @param fee
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
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
     * @return invoice_title
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * @param invoiceTitle
     */
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    /**
     * @return is_allocated_stock
     */
    public Boolean getIsAllocatedStock() {
        return isAllocatedStock;
    }

    /**
     * @param isAllocatedStock
     */
    public void setIsAllocatedStock(Boolean isAllocatedStock) {
        this.isAllocatedStock = isAllocatedStock;
    }

    /**
     * @return is_invoice
     */
    public Boolean getIsInvoice() {
        return isInvoice;
    }

    /**
     * @param isInvoice
     */
    public void setIsInvoice(Boolean isInvoice) {
        this.isInvoice = isInvoice;
    }

    /**
     * @return lock_expire
     */
    public Date getLockExpire() {
        return lockExpire;
    }

    /**
     * @param lockExpire
     */
    public void setLockExpire(Date lockExpire) {
        this.lockExpire = lockExpire;
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
     * @return offset_amount
     */
    public BigDecimal getOffsetAmount() {
        return offsetAmount;
    }

    /**
     * @param offsetAmount
     */
    public void setOffsetAmount(BigDecimal offsetAmount) {
        this.offsetAmount = offsetAmount;
    }

    /**
     * @return order_status
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * @param orderStatus
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * @return payment_method_name
     */
    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    /**
     * @param paymentMethodName
     */
    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
    }

    /**
     * @return payment_status
     */
    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * @param paymentStatus
     */
    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
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
     * @return promotion
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     * @param promotion
     */
    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    /**
     * @return promotion_discount
     */
    public BigDecimal getPromotionDiscount() {
        return promotionDiscount;
    }

    /**
     * @param promotionDiscount
     */
    public void setPromotionDiscount(BigDecimal promotionDiscount) {
        this.promotionDiscount = promotionDiscount;
    }

    /**
     * @return shipping_method_name
     */
    public String getShippingMethodName() {
        return shippingMethodName;
    }

    /**
     * @param shippingMethodName
     */
    public void setShippingMethodName(String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
    }

    /**
     * @return shipping_status
     */
    public Integer getShippingStatus() {
        return shippingStatus;
    }

    /**
     * @param shippingStatus
     */
    public void setShippingStatus(Integer shippingStatus) {
        this.shippingStatus = shippingStatus;
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
     * @return tax
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * @param tax
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
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
     * @return area
     */
    public Long getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(Long area) {
        this.area = area;
    }

    /**
     * @return coupon_code
     */
    public Long getCouponCode() {
        return couponCode;
    }

    /**
     * @param couponCode
     */
    public void setCouponCode(Long couponCode) {
        this.couponCode = couponCode;
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

    /**
     * @return operator
     */
    public Long getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(Long operator) {
        this.operator = operator;
    }

    /**
     * @return payment_method
     */
    public Long getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod
     */
    public void setPaymentMethod(Long paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return shipping_method
     */
    public Long getShippingMethod() {
        return shippingMethod;
    }

    /**
     * @param shippingMethod
     */
    public void setShippingMethod(Long shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
}