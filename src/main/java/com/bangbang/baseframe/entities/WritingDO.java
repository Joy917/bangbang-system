package com.bangbang.baseframe.entities;

import javax.persistence.*;

/**
 * @Description 帖子、文章父类
 * @Author Loca
 * @Date 2018/12/28 0028 14:34
 **/
@MappedSuperclass
public class WritingDO extends BaseDO {

    /**
     * 标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 作者
     */
    @Column(name = "author")
    private String author;

    /**
     * 内容
     */
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "content", columnDefinition = "LongText")
    private String content;

    /**
     * 点赞数
     */
    @Column(name = "likes")
    private Long likes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }
}
