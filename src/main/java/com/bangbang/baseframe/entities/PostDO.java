package com.bangbang.baseframe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description 帖子实体类
 * @Author Loca
 * @Date 2018/12/28 14:21
 **/
@Entity
@Table(name = "t_post",schema = "bangbang")
public class PostDO extends WritingDO {

    /**
     * 所属论坛id
     */
    @Column(name = "refer_forum_id")
    private Long referForumId;

    /**
     * 帖子最后回复时间
     */
    @Column(name = "last_reply_time")
    private Long lastReplyTime;

    public Long getReferForumId() {
        return referForumId;
    }

    public void setReferId(Long referForumId) {
        this.referForumId = referForumId;
    }

    public Long getLastReplyTime() {
        return lastReplyTime;
    }

    public void setLastReplyTime(Long lastReplyTime) {
        this.lastReplyTime = lastReplyTime;
    }
}
