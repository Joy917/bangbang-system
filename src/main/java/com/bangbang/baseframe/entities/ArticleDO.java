package com.bangbang.baseframe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description 文章实体类
 * @Author Loca
 * @Date 2018/12/28 0028 15:07
 **/
@Entity
@Table(name = "t_article",schema = "bangbang")
public class ArticleDO extends WritingDO {

    /**
     * 推荐评分
     */
    @Column(name = "recommend_rank")
    private Integer recommendRank;

    /**
     * 申请审核状态
     */
    @Column(name = "apply_status")
    private Integer applyStatus;

    public Integer getRecommendRank() {
        return recommendRank;
    }

    public void setRecommendRank(Integer recommendRank) {
        this.recommendRank = recommendRank;
    }

    public Integer getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }
}
