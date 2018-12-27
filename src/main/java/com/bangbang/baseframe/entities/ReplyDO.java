package com.bangbang.baseframe.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_reply", schema = "bangbang")
public class ReplyDO {
    private Long id;
    private Long commentId;
    private Long fromUserId;
    private Long toUserId;
    private String replyContent;
    private Long createTime;
    private Integer messageAlert;
    private Integer status;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "comment_id")
    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    @Column(name = "from_user_id")
    public Long getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }

    @Column(name = "to_user_id")
    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }

    @Column(name = "reply_content")
    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    @Column(name = "create_time")
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Column(name = "message_alert")
    public Integer getMessageAlert() {
        return messageAlert;
    }

    public void setMessageAlert(Integer messageAlert) {
        this.messageAlert = messageAlert;
    }

    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReplyDO replyDO = (ReplyDO) o;
        return Objects.equals(id, replyDO.id) &&
                Objects.equals(commentId, replyDO.commentId) &&
                Objects.equals(fromUserId, replyDO.fromUserId) &&
                Objects.equals(toUserId, replyDO.toUserId) &&
                Objects.equals(replyContent, replyDO.replyContent) &&
                Objects.equals(createTime, replyDO.createTime) &&
                Objects.equals(messageAlert, replyDO.messageAlert) &&
                Objects.equals(status, replyDO.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentId, fromUserId, toUserId, replyContent, createTime, messageAlert, status);
    }
}
