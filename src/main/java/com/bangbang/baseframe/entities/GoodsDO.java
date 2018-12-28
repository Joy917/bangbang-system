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
@Table(name = "t_goods",schema = "bangbang")
public class GoodsDO extends BaseDO{

    /**
     * 商品名称
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 兑换所需积分
     */
    @Column(name = "exchange_points")
    private String exchangePoints;

    /**
     * 商品数量
     */
    @Column(name = "goods_num")
    private Long goodsNum;

    /**
     * 商品展示图片
     */
    @Column(name = "picture")
    private String picture;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getExchangePoints() {
        return exchangePoints;
    }

    public void setExchangePoints(String exchangePoints) {
        this.exchangePoints = exchangePoints;
    }

    public Long getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Long goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
