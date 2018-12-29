package com.bangbang.baseframe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description 图片实体类
 * @Author Joy
 * @Date 2018/12/29 1:01
 **/
@Entity
@Table(name = "picture", schema = "bangbang")
public class PictureDO extends BaseDO {

    /*
    关联Id，可能有一对多情况
     */
    @Column(name = "refer_id")
    private String referId;
    /*
    图片类型，1-用户表，2-商品表
     */
    @Column(name = "picture_type")
    private String pictureType;
    /*
     图片路径
     */
    @Column(name = "picture_path")
    private String picturePath;

    public String getPictureType() {
        return pictureType;
    }

    public void setPictureType(String pictureType) {
        this.pictureType = pictureType;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }
}
