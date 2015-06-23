package com.bbh.shop.api.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_deposit")
public class Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private BigDecimal balance;

    private BigDecimal credit;

    private BigDecimal debit;

    private String memo;

    private String operator;

    private Integer type;

    private Long member;

    private Long orders;

    private Long payment;

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
     * @return balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * @param balance
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * @return credit
     */
    public BigDecimal getCredit() {
        return credit;
    }

    /**
     * @param credit
     */
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    /**
     * @return debit
     */
    public BigDecimal getDebit() {
        return debit;
    }

    /**
     * @param debit
     */
    public void setDebit(BigDecimal debit) {
        this.debit = debit;
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

    /**
     * @return payment
     */
    public Long getPayment() {
        return payment;
    }

    /**
     * @param payment
     */
    public void setPayment(Long payment) {
        this.payment = payment;
    }
}