package com.bangbang.baseframe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @Description 广告管理实体类
 * @Author Loca
 * @Date 2018/12/28 0028 11:23
 **/
@Entity
@Table(name = "advertise", schema = "bangbang")
public class AdvertiseDO extends BaseDO {

    /**
     * 广告排序序号
     */
    @Column(name = "advertise_rank")
    private Integer advertiseRank;

    /**
     * 广告标题
     */
    @Column(name = "advertise_title")
    private String advertiseTitle;

    /**
     * 广告位置
     */
    @Column(name = "advertise_position")
    private String advertisePosition;

    /**
     * 广告链接地址
     */
    @Column(name = "advertise_link")
    private String advertiseLink;

    /**
     * 开始日期
     */
    @Column(name = "start_time")
    private LocalDateTime startTime;

    /**
     * 结束日期
     */
    @Column(name = "end_time")
    private LocalDateTime endTime;

    /**
     * 图片表主键
     */
    @Column(name = "picture_id")
    private String pictureId;

    public Integer getAdvertiseRank() {
        return advertiseRank;
    }

    public void setAdvertiseRank(Integer advertiseRank) {
        this.advertiseRank = advertiseRank;
    }

    public String getAdvertiseTitle() {
        return advertiseTitle;
    }

    public void setAdvertiseTitle(String advertiseTitle) {
        this.advertiseTitle = advertiseTitle;
    }

    public String getAdvertisePosition() {
        return advertisePosition;
    }

    public void setAdvertisePosition(String advertisePosition) {
        this.advertisePosition = advertisePosition;
    }

    public String getAdvertiseLink() {
        return advertiseLink;
    }

    public void setAdvertiseLink(String advertiseLink) {
        this.advertiseLink = advertiseLink;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }
}
