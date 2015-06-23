package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_promotion_member_rank")
public class PromotionMemberRank {
    @Id
    private Long promotions;

    @Id
    @Column(name = "member_ranks")
    private Long memberRanks;

    /**
     * @return promotions
     */
    public Long getPromotions() {
        return promotions;
    }

    /**
     * @param promotions
     */
    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    /**
     * @return member_ranks
     */
    public Long getMemberRanks() {
        return memberRanks;
    }

    /**
     * @param memberRanks
     */
    public void setMemberRanks(Long memberRanks) {
        this.memberRanks = memberRanks;
    }
}