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
@Table(name = "post", schema = "bangbang")
public class PostDO extends WritingDO {

    /**
     * 所属论坛id
     */
    @Column(name = "forum_id")
    private Long forumId;

    public Long getForumId() {
        return forumId;
    }

    public void setForumId(Long forumId) {
        this.forumId = forumId;
    }

}
