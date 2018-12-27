package com.bangbang.baseframe.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_post", schema = "bangbang")
public class PostDO {
    private Long id;
    private Long referId;
    private String title;
    private String author;
    private Long createTime;
    private Long replyTime;
    private String content;
    private Long likes;
    private Integer postStatus;
    private Integer status;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "refer_id")
    public Long getReferId() {
        return referId;
    }

    public void setReferId(Long referId) {
        this.referId = referId;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name = "create_time")
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Column(name = "reply_time")
    public Long getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Long replyTime) {
        this.replyTime = replyTime;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "likes")
    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    @Column(name = "post_status")
    public Integer getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(Integer postStatus) {
        this.postStatus = postStatus;
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
        PostDO postDO = (PostDO) o;
        return Objects.equals(id, postDO.id) &&
                Objects.equals(referId, postDO.referId) &&
                Objects.equals(title, postDO.title) &&
                Objects.equals(author, postDO.author) &&
                Objects.equals(createTime, postDO.createTime) &&
                Objects.equals(replyTime, postDO.replyTime) &&
                Objects.equals(content, postDO.content) &&
                Objects.equals(likes, postDO.likes) &&
                Objects.equals(postStatus, postDO.postStatus) &&
                Objects.equals(status, postDO.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, referId, title, author, createTime, replyTime, content, likes, postStatus, status);
    }
}
