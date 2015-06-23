package com.bbh.shop.api.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_consultation")
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private String content;

    private String ip;

    @Column(name = "is_show")
    private Boolean isShow;

    @Column(name = "for_consultation")
    private Long forConsultation;

    private Long member;

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
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return is_show
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * @param isShow
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * @return for_consultation
     */
    public Long getForConsultation() {
        return forConsultation;
    }

    /**
     * @param forConsultation
     */
    public void setForConsultation(Long forConsultation) {
        this.forConsultation = forConsultation;
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