package com.bangbang.baseframe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description
 * @Author Loca
 * @Date 2018/12/28 0028 15:12
 **/
@Entity
@Table(name = "t_comment",schema = "bangbang")
public class CommentDO extends BaseDO{

    /**
     * 评论从属 0-帖子 1-文章
     */
    @Column(name = "from_type")
    private String fromType;

    /**
     * 对应帖子、文章id
     */
    @Column(name = "refer_id")
    private Long referId;

    /**
     * 评论者
     */
    @Column(name = "author")
    private String author;

    /**
     * 评论内容
     */
    @Column(name = "content")
    private String content;

    /**
     * 已读状态 T-已读 F-未读
     */
    @Column(name = "read_status")
    private boolean readStatus;

    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    public Long getReferId() {
        return referId;
    }

    public void setReferId(Long referId) {
        this.referId = referId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isReadStatus() {
        return readStatus;
    }

    public void setReadStatus(boolean readStatus) {
        this.readStatus = readStatus;
    }
}
