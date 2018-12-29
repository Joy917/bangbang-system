package com.bangbang.baseframe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @Description 回复实体类
 * @Author Joy
 * @Date 2018/12/29 23:17
 **/
@Entity
@Table(name = "reply")
public class ReplyDO extends BaseDO {

    /*
    回复人Id
     */
    @Column(name = "reply_from")
    private Long replyFrom;

    /*
        回复对象Id
         */
    @Column(name = "reply_to")
    private Long replyTo;

    /*
    回复时间
     */
    @Column(name = "reply_time")
    private LocalDateTime replyTime;

    /*
    关联评论表主键Id
     */
    @Column(name = "comment_id")
    private Long commentId;

    /*
    回复内容,限制长度，过滤词汇
     */
    @Column(name = "reply_content", columnDefinition = "Text")
    private String replyContent;
}
