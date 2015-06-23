package com.bbh.shop.api.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private String author;

    private Long hits;

    @Column(name = "is_publication")
    private Boolean isPublication;

    @Column(name = "is_top")
    private Boolean isTop;

    @Column(name = "seo_description")
    private String seoDescription;

    @Column(name = "seo_keywords")
    private String seoKeywords;

    @Column(name = "seo_title")
    private String seoTitle;

    private String title;

    @Column(name = "article_category")
    private Long articleCategory;

    private String content;

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
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
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
     * @return is_publication
     */
    public Boolean getIsPublication() {
        return isPublication;
    }

    /**
     * @param isPublication
     */
    public void setIsPublication(Boolean isPublication) {
        this.isPublication = isPublication;
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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return article_category
     */
    public Long getArticleCategory() {
        return articleCategory;
    }

    /**
     * @param articleCategory
     */
    public void setArticleCategory(Long articleCategory) {
        this.articleCategory = articleCategory;
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
}