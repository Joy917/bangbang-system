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
@Table(name = "article", schema = "bangbang")
public class ArticleDO extends WritingDO {

    /**
     * 推荐评分
     */
    @Column(name = "article_rank")
    private Integer articleRank;

    /**
     * 申请审核状态
     */
    @Column(name = "article_status")
    private Integer articleStatus;

    public Integer getArticleRank() {
        return articleRank;
    }

    public void setArticleRank(Integer articleRank) {
        this.articleRank = articleRank;
    }

    public Integer getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }
}
