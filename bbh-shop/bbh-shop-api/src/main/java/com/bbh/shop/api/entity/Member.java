package com.bbh.shop.api.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private String address;

    private BigDecimal amount;

    @Column(name = "attribute_value0")
    private String attributeValue0;

    @Column(name = "attribute_value1")
    private String attributeValue1;

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

    private BigDecimal balance;

    private Date birth;

    private String email;

    private Integer gender;

    @Column(name = "is_enabled")
    private Boolean isEnabled;

    @Column(name = "is_locked")
    private Boolean isLocked;

    @Column(name = "locked_date")
    private Date lockedDate;

    @Column(name = "login_date")
    private Date loginDate;

    @Column(name = "login_failure_count")
    private Integer loginFailureCount;

    @Column(name = "login_ip")
    private String loginIp;

    private String mobile;

    private String name;

    private String password;

    private String phone;

    private Long point;

    @Column(name = "register_ip")
    private String registerIp;

    @Column(name = "safe_key_expire")
    private Date safeKeyExpire;

    @Column(name = "safe_key_value")
    private String safeKeyValue;

    private String username;

    @Column(name = "zip_code")
    private String zipCode;

    private Long area;

    @Column(name = "member_rank")
    private Long memberRank;

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
     * @return birth
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * @param birth
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
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
     * @return is_locked
     */
    public Boolean getIsLocked() {
        return isLocked;
    }

    /**
     * @param isLocked
     */
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    /**
     * @return locked_date
     */
    public Date getLockedDate() {
        return lockedDate;
    }

    /**
     * @param lockedDate
     */
    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    /**
     * @return login_date
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * @param loginDate
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * @return login_failure_count
     */
    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    /**
     * @param loginFailureCount
     */
    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    /**
     * @return login_ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * @param loginIp
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
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
     * @return register_ip
     */
    public String getRegisterIp() {
        return registerIp;
    }

    /**
     * @param registerIp
     */
    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    /**
     * @return safe_key_expire
     */
    public Date getSafeKeyExpire() {
        return safeKeyExpire;
    }

    /**
     * @param safeKeyExpire
     */
    public void setSafeKeyExpire(Date safeKeyExpire) {
        this.safeKeyExpire = safeKeyExpire;
    }

    /**
     * @return safe_key_value
     */
    public String getSafeKeyValue() {
        return safeKeyValue;
    }

    /**
     * @param safeKeyValue
     */
    public void setSafeKeyValue(String safeKeyValue) {
        this.safeKeyValue = safeKeyValue;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
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
     * @return member_rank
     */
    public Long getMemberRank() {
        return memberRank;
    }

    /**
     * @param memberRank
     */
    public void setMemberRank(Long memberRank) {
        this.memberRank = memberRank;
    }
}