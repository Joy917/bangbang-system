package com.bangbang.baseframe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description 评论实体类
 * @Author Loca
 * @Date 2018/12/28 0028 15:12
 **/
@Entity
@Table(name = "comment", schema = "bangbang")
public class CommentDO extends BaseDO{

    /**
     * 评论从属 1-帖子 2-文章
     */
    @Column(name = "comment_type")
    private String commentType;

    /**
     * 对应帖子、文章id
     */
    @Column(name = "refer_id")
    private Long referId;

    /**
     * 评论者
     */
    @Column(name = "comment_from")
    private String commentFrom;

    /**
     * 评论内容
     */
    @Column(name = "comment_content")
    private String commentContent;

    /**
     * 已读状态 T-已读 F-未读
     */
    @Column(name = "comment_status")
    private boolean commentStatus;

    public String getCommentType() {
        return commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType;
    }

    public Long getReferId() {
        return referId;
    }

    public void setReferId(Long referId) {
        this.referId = referId;
    }

    public String getCommentFrom() {
        return commentFrom;
    }

    public void setCommentFrom(String commentFrom) {
        this.commentFrom = commentFrom;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public boolean isCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(boolean commentStatus) {
        this.commentStatus = commentStatus;
    }
}
