package com.bangbang.baseframe.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_article", schema = "bangbang")
public class ArticleDO {
    private Long id;
    private String title;
    private String author;
    private Long createTime;
    private Long replyTime;
    private String content;
    private Long applyTime;
    private Long likes;
    private Integer recomandRank;
    private Integer status;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Column(name = "apply_time")
    public Long getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Long applyTime) {
        this.applyTime = applyTime;
    }

    @Column(name = "likes")
    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    @Column(name = "recomand_rank")
    public Integer getRecomandRank() {
        return recomandRank;
    }

    public void setRecomandRank(Integer recomandRank) {
        this.recomandRank = recomandRank;
    }

    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

   
}
