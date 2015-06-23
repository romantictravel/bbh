package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_article_tag")
public class ArticleTag {
    @Id
    private Long articles;

    @Id
    private Long tags;

    /**
     * @return articles
     */
    public Long getArticles() {
        return articles;
    }

    /**
     * @param articles
     */
    public void setArticles(Long articles) {
        this.articles = articles;
    }

    /**
     * @return tags
     */
    public Long getTags() {
        return tags;
    }

    /**
     * @param tags
     */
    public void setTags(Long tags) {
        this.tags = tags;
    }
}