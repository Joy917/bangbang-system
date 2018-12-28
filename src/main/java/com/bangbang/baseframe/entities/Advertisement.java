package com.bangbang.baseframe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description 广告管理实体类
 * @Author Loca
 * @Date 2018/12/28 0028 11:23
 **/
@Entity
@Table(name = "t_advertisement", schema = "bangbang")
public class Advertisement extends BaseDO {

    /**
     * 广告排序序号
     */
    @Column(name = "order_cd")
    private Integer orderCd;

    /**
     * 广告标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 广告位置
     */
    @Column(name = "position")
    private String position;

    /**
     * 广告链接地址
     */
    @Column(name = "link_address")
    private String linkAddress;

    /**
     * 开始日期
     */
    @Column(name = "start_date")
    private Long startDate;

    /**
     * 结束日期
     */
    @Column(name = "end_date")
    private Long endDate;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Long startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Long endTime;

    /**
     * 广告图片地址
     */
    @Column(name = "picture")
    private String picture;

    public Integer getOrderCd() {
        return orderCd;
    }

    public void setOrderCd(Integer orderCd) {
        this.orderCd = orderCd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
