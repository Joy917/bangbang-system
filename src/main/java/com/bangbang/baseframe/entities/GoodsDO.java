package com.bangbang.baseframe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description 商城商品表
 * @Author Loca
 * @Date 2018/12/28 0028 15:31
 **/
@Entity
@Table(name = "goods", schema = "bangbang")
public class GoodsDO extends BaseDO{

    /**
     * 商品名称
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 兑换所需积分
     */
    @Column(name = "goods_points")
    private String goodsPoints;

    /**
     * 商品数量
     */
    @Column(name = "goods_num")
    private Long goodsNum;

    /**
     * 商品展示图片关联Id，图片表
     */
    @Column(name = "picture_id")
    private Long pictureId;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPoints() {
        return goodsPoints;
    }

    public void setGoodsPoints(String goodsPoints) {
        this.goodsPoints = goodsPoints;
    }

    public Long getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Long goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Long getPictureId() {
        return pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }
}
