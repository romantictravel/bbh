package com.bbh.shop.api.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private String account;

    private BigDecimal amount;

    private String bank;

    private Date expire;

    private BigDecimal fee;

    private String memo;

    private Integer method;

    private String operator;

    private String payer;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "payment_plugin_id")
    private String paymentPluginId;

    private String sn;

    private Integer status;

    private Integer type;

    private Long member;

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
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * @param bank
     */
    public void setBank(String bank) {
        this.bank = bank;
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
     * @return method
     */
    public Integer getMethod() {
        return method;
    }

    /**
     * @param method
     */
    public void setMethod(Integer method) {
        this.method = method;
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
     * @return payer
     */
    public String getPayer() {
        return payer;
    }

    /**
     * @param payer
     */
    public void setPayer(String payer) {
        this.payer = payer;
    }

    /**
     * @return payment_date
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * @param paymentDate
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * @return payment_method
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return payment_plugin_id
     */
    public String getPaymentPluginId() {
        return paymentPluginId;
    }

    /**
     * @param paymentPluginId
     */
    public void setPaymentPluginId(String paymentPluginId) {
        this.paymentPluginId = paymentPluginId;
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
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
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