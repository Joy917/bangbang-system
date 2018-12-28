package com.bangbang.baseframe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description 论坛实体类
 * @Author Loca
 * @Date 2018/12/28 0028 11:31
 **/
@Entity
@Table(name = "t_forum",schema = "bangbang")
public class ForumDO extends BaseDO{

    /**
     * 论坛名称
     */
    @Column(name = "forum_name")
    private String forumName;

    /**
     * 论坛拥有者（申请人）
     */
    @Column(name = "forum_owener")
    private String forumOwner;

    /**
     * 论坛简介（申请原因）
     */
    @Column(name = "forum_description")
    private String forumDescription;

    /**
     * 论坛关注人数
     */
    @Column(name = "forum_follower_num")
    private Long forumFollowerNum;

    /**
     * 论坛推荐程度
     */
    @Column(name = "forum_rank")
    private Integer forumRank;

    /**
     * 论坛状态 0-待审核 1-审核通过 2-审核拒绝
     */
    @Column(name = "forum_status")
    private String forumStatus;

    public String getForumName() {
        return forumName;
    }

    public void setForumName(String forumName) {
        this.forumName = forumName;
    }

    public String getForumOwner() {
        return forumOwner;
    }

    public void setForumOwner(String forumOwner) {
        this.forumOwner = forumOwner;
    }

    public String getForumDescription() {
        return forumDescription;
    }

    public void setForumDescription(String forumDescription) {
        this.forumDescription = forumDescription;
    }

    public Long getForumFollowerNum() {
        return forumFollowerNum;
    }

    public void setForumFollowerNum(Long forumFollowerNum) {
        this.forumFollowerNum = forumFollowerNum;
    }

    public Integer getForumRank() {
        return forumRank;
    }

    public void setForumRank(Integer forumRank) {
        this.forumRank = forumRank;
    }

    public String getForumStatus() {
        return forumStatus;
    }

    public void setForumStatus(String forumStatus) {
        this.forumStatus = forumStatus;
    }
}
